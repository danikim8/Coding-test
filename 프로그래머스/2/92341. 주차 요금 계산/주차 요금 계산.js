function solution(fees, records) {
    const [basicTime, basicFee, unitTime, unitFee] = fees;
    
    const inMap = new Map(); // 차량입차 시간
    const timeMap = new Map(); //차량별 누적주차시간
    
    const toMinutes = (timeStr) => {
        const [h, m] = timeStr.split(":").map(Number) //숫자로 구조분해할당
        return h * 60 + m;
    };
    
    //in & out 계산
    records.forEach((record) => {
        const [time, car, type] = record.split(" ");
        const minutes = toMinutes(time);
        
        if(type === "IN") {
            inMap.set(car, minutes);
        } else {
            //out 이면 주차시간 계산
            const inTime = inMap.get(car); //입차시간
            const diff = minutes - inTime; //출차시간 - 입차시간
            //누적주차시간 더하기
            timeMap.set(car, (timeMap.get(car) || 0 ) + diff);
            inMap.delete(car);
        }
    });
    
    //아직 출차 안한 차량,남은차 (23:59 출차간주)
    const endOfDay = toMinutes("23:59");
    for(const [car, inTime] of inMap.entries()){
        const diff = endOfDay - inTime;
        timeMap.set(car, (timeMap.get(car) || 0) + diff);
    }
    
    //차량 번호 오름차순 -> 요금계산
    const result = [...timeMap.entries()]
        .sort((a,b) => a[0].localeCompare(b[0]))
        .map(([car, totalTime]) => {
            if(totalTime <= basicTime) return basicFee;
            const extraTime = totalTime - basicTime;
            return basicFee + Math.ceil(extraTime / unitTime ) * unitFee;
        });
    return result;
    
}
