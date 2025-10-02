function solution(numbers) {
    const resultSet = new Set();
    
    for(let i=0; i<numbers.length; i++){
        for(let j=i+1; j<numbers.length; j++){
            resultSet.add(numbers[i]+numbers[j]);
        }
    }
    return [...resultSet].sort((a,b) => a - b);
}
