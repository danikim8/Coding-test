function solution(s) {
    const result = [];
    const lastIndex = {}; // 글자별 마지막 등장 인덱스
    
    for (let i=0; i<s.length; i++){
        const char = s[i];
        
        if (lastIndex[char] === undefined){
            result.push(-1)
        } else {
            // 이전 위치와의 거리
            result.push(i - lastIndex[char]);
        }
        
        //마지막 위치 갱신
        lastIndex[char] = i;        
    }
    return result;
    }