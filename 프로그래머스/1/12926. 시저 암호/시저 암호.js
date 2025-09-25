function solution(s, n) {
    let answer = "";
    
    for (let i=0; i<s.length; i++){
        let ch = s[i];
        
        if (ch === " "){
            answer += " ";
            continue;
        }
        
        let code = s.charCodeAt(i);
        
        // 대문자 범위: 65~90 (A~Z)
        if (code >= 65 && code <= 90){
            answer += String.fromCharCode((code - 65 + n) % 26 + 65);
        }
        // 소문자 범위: 97~122 (a~z)
        else if (code >= 97 && code <= 122){
            answer += String.fromCharCode((code - 97 + n) % 26 + 97);
        }
    }
    return answer;
}