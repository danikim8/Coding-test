function solution(n, arr1, arr2) {
    return arr1.map((row, i) => {
        // 두 줄을 OR 연산
        const binary = (row | arr2[i]).toString(2).padStart(n, "0");
        
        //1->#, 0->공백변환
        return binary.replace(/1/g, "#").replace(/0/g, " ");
    });
}