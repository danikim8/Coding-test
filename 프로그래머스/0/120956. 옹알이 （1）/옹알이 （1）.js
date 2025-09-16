function solution(babbling) {
    const words = ["aya", "ye", "woo", "ma"];
    let answer = 0 ;
    
    for (let str of babbling) {
        let temp = str;
        
        // 각 발음이 문자열에 2번 이상 나오면 불가능
        let isValid = true;
        for(let w of words) {
            if (temp.split(w).length -1 >1){
                isValid = false;
                break;
            }
        }
        if (!isValid) continue;
        
        //허용된 발음들을 모두 공백으로 치환
        for (let w of words) {
            temp = temp.split(w).join(" ");
        }
        
        //공백(또는 빈 문자열)만 남아 있으면 가능한 발음
        if (temp.trim() === ""){
            answer++;
        }
    }
    return answer;
}

// 정규식 이용.
// function solution(babbling) {
//   var answer = 0;

//   // 1) 허용 발음만 연속해서 나오는 문자열 패턴
//   const regex = /^(aya|ye|woo|ma)+$/;

//   // 2) 배열의 각 단어 검사
//   babbling.forEach(word => {
//     if (regex.test(word)) answer++;  
//   })

//   return answer;
// }
