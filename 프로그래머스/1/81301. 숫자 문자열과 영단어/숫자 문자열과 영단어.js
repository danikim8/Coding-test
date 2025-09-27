function solution(s) {
    const numbers = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
    numbers.forEach((word, index) => {
        s = s.replaceAll(word, index)
    });
    
    return Number(s);
    
}