function solution(fees, records) {
  const [basicTime, basicFee, unitTime, unitFee] = fees;

  const inMap = new Map();    // 차량 입차 시간 저장
  const timeMap = new Map();  // 차량별 누적 주차 시간 저장

  const toMinutes = (timeStr) => {
    const [h, m] = timeStr.split(":").map(Number);
    return h * 60 + m;
  };

  records.forEach((record) => {
    const [time, car, type] = record.split(" ");
    const minutes = toMinutes(time);

    if (type === "IN") {
      inMap.set(car, minutes);
    } else {
      // OUT이면 주차 시간 계산
      const inTime = inMap.get(car);
      const diff = minutes - inTime;
      timeMap.set(car, (timeMap.get(car) || 0) + diff);
      inMap.delete(car);
    }
  });

  // 아직 출차 안 한 차량 (23:59 출차로 간주)
  const endOfDay = toMinutes("23:59");
  for (const [car, inTime] of inMap.entries()) {
    const diff = endOfDay - inTime;
    timeMap.set(car, (timeMap.get(car) || 0) + diff);
  }

  // 차량 번호 오름차순 정렬 후 요금 계산
  const result = [...timeMap.entries()]
    .sort((a, b) => a[0].localeCompare(b[0]))
    .map(([car, totalTime]) => {
      if (totalTime <= basicTime) return basicFee;
      const extraTime = totalTime - basicTime;
      return basicFee + Math.ceil(extraTime / unitTime) * unitFee;
    });

  return result;
}
