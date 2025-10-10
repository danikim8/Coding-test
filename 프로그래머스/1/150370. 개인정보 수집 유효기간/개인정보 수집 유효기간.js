function solution(today, terms, privacies) {
    //약관 정보를 {약관:유효개월} 저장
    const termMap = {};
    for (let term of terms) {
        const [type, months] = term.split(" ");
        termMap[type] = Number(months);
    }
    
    //날짜 -> 총일수 변환함수
    const toDays = (date) => {
        const [y, m, d] = date.split('.').map(Number);
        return y * 12 * 28 + m * 28 + d;
    };
    
    const todayDays = toDays(today);
    const result = [];
    
    //개인정보마다 유효기간 계산
    privacies.forEach((privacy, i) => {
        const [date, type] = privacy.split(' ');
        const expireDays = toDays(date) + termMap[type] * 28 -1;
        
        //파기대상
        if (expireDays < todayDays ) result.push(i+1); 
    })
    return result;
}