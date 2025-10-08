function solution(n, k) {
    const converted = n.toString(k);
    
    const numbers = converted.split("0").filter(v => v !== '');
    
    let count = 0;
    for (let numStr of numbers) {
        const num = Number(numStr);
        if( isPrime(num)) count++;
    }
    return count;
}

function isPrime(num) {
    if (num<2) return false;
    for (let i=2; i<=Math.sqrt(num); i++){
        if (num%i === 0) return false;
    }
    return true;
}