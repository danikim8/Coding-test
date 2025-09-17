function solution(n) { //3
    let count =0;
    let num =0;
    
    while (count < n){
        num++;
        if (num %3 ===0 || String(num).includes('3')){
            continue;
        }
        count++;
    }
    
    return num;
}