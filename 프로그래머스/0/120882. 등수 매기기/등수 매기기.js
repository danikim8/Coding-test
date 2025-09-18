function solution(score) {
    let avgArr = score.map(([eng, math])=> (eng + math) /2);
    let sorted = [...avgArr].sort((a,b) =>b-a);
    return avgArr.map(avg => sorted.indexOf(avg)+1);
}