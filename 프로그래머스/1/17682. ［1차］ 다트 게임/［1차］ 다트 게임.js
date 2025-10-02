function solution(dartResult) {
    const scores = []; //각 기회의 점수를 저장할 배열
    let num = ""; // 숫자 임시 저장 (10같은 경우 처리위해)
    
    for ( let i=0; i<dartResult.length; i++){
        const ch = dartResult[i];
        
        if (!isNaN(ch)) {
            //숫자일 경우(0-9)
            num += ch; //1자리, 2자리 일수도 있어서 문자열로 이어줘야함!
        } else if(ch === 'S' || ch === 'D' || ch === 'T'){
            //보너스처리
            let score = parseInt(num);
            if (ch === 'S') score = Math.pow(score, 1);
            if (ch === 'D') score = Math.pow(score, 2);
            if (ch === 'T') score = Math.pow(score, 3);
            scores.push(score);
            num = "";//숫자 초기화
        } else if(ch === '*' || ch === '#'){
            //옵션처리
            if (ch === '*') { //2배
                scores[scores.length - 1] *= 2;
                
                if (scores.length > 1){
                    scores[scores.length - 2] *= 2;
                }
            } else if (ch === '#') {
                scores[scores.length - 1] *= -1;
            }
        }
    }
    
    return scores.reduce((a,b) => a + b, 0);
}