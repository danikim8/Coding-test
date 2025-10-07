function solution(n, t, m, p) {
    let all = "";
    let num = 0; 
    
    //전체 문자열의 길이 이어붙이기, 필요한만큼!
    while ( all.length < t * m ) {
        all += num.toString(n).toUpperCase();
        num++;
    }
    
    let result = "";
    
    for(let i= p-1; result.length<t; i+=m){
        result += all[i];
    }
    return result;
}