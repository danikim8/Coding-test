function solution(s) {
    const sets = s.slice(2,-2)
                .split('},{')
                .map(str => str.split(",").map(Number))
                .sort((a,b) => a.length - b.length);
    
    const result = [];
    
    for(let arr of sets) {
        for(let num of arr){
            if(!result.includes(num)) result.push(num);
        }
    }
    return result;
}