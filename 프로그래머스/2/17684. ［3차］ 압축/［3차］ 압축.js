function solution(msg) {
    const dictionary = {};
    const result = [];
    
    //1.사전초기화
    let index = 1;
    for (let i=65; i<=90; i++){
        dictionary[String.fromCharCode(i)] = index++;
    }
    
    let nextIndex = 27;
    let i = 0;
    while (i<msg.length){
        let w = msg[i]; //현재글자
        let j = i +1;
        
        //2.사전에 존재하는 가장 긴 문자열 w 찾기
        while (j <= msg.length && dictionary[msg.slice(i,j)]) {
            w = msg.slice(i, j);
            j++;
        }
        
        //3.출력:w의 사전번호
        result.push(dictionary[w]);
        
        //4.다음 글자c가 있다면, w+c 등록
        if( j<= msg.length) {
            const newWord = msg.slice(i,j);
            dictionary[newWord] = nextIndex++;
        }
        
        //5.다음 탐색 시작 인덱스 갱신
        i += w.length;
    }
    return result;
}