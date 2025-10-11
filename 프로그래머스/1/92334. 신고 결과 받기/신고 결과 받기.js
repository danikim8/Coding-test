function solution(id_list, report, k) {
  // 1. 중복 제거
  const uniqueReports = [...new Set(report)];

  // 2. 각 유저가 신고한 대상자 목록
  const reportMap = new Map();
  id_list.forEach(id => reportMap.set(id, []));

  uniqueReports.forEach(r => {
    const [reporter, reported] = r.split(" ");
    reportMap.get(reporter).push(reported);
  });

  // 3. 신고당한 횟수 계산
  const reportedCount = new Map();
  id_list.forEach(id => reportedCount.set(id, 0));

  uniqueReports.forEach(r => {
    const [, reported] = r.split(" ");
    reportedCount.set(reported, reportedCount.get(reported) + 1);
  });

  // 4. 정지된 유저 목록
  const banned = new Set();
  for (const [user, count] of reportedCount.entries()) {
    if (count >= k) banned.add(user);
  }

  // 5. 각 유저가 받은 메일 수 계산
  const result = id_list.map(id => {
    const reportedUsers = reportMap.get(id);
    return reportedUsers.filter(u => banned.has(u)).length;
  });

  return result;
}