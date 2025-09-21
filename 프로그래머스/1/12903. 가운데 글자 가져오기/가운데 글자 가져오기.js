function solution(s) {
    const len = s.length;
    const mid = Math.floor(len /2)
    
    if (len % 2 === 1) return s[mid];
    else {
        return s[mid-1] + s[mid]
    }
}