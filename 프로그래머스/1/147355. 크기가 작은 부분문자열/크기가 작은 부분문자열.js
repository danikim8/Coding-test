function solution(t, p) {
    let count =0;
    const pLength = p.length;
    const pNum = Number(p);
    
    for (let i=0; i<=t.length - p.length; i++){
        const subStr = t.slice(i, i+pLength);
        if(Number(subStr) <= pNum) {
            count++;
        }
    }
    return count;
}