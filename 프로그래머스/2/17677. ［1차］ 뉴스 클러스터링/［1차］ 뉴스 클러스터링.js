function solution(str1, str2) {
    str1 = str1.toUpperCase();
    str2 = str2.toUpperCase();
    
    const getBigrams = (s) => {
        const arr = [];
        for (let i=0; i<s.length -1; i++){
            const pair = s[i] + s[i+1];
            if(/^[A-Z]{2}$/.test(pair)) arr.push(pair);
        }
        return arr;
    };
    
    const A = getBigrams(str1);
    const B = getBigrams(str2);
    
    //교집합
    const intersection = [];
    const copyB = [...B];
    for (let x of A){
        const index = copyB.indexOf(x);
        if (index !== -1) {
            intersection.push(x);
            copyB.splice(index,1)
        }
    }
    
    //합집합 (A + B - 교집합)
    const union = [...A, ...B];
    for(let x of intersection){
        const index = union.indexOf(x);
        if (index !== -1) union.splice(index,1); // 중복처리
    }
    
    const jaccard = union.length === 0 ? 1 : intersection.length / union.length;
    
    return Math.floor(jaccard * 65536);
}