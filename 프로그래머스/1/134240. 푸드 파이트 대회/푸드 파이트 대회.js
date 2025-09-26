function solution(food) {
    let left = "";

    // 음식 번호 1부터 시작 (0번은 물)
    for (let i = 1; i < food.length; i++) {
        left += String(i).repeat(Math.floor(food[i] / 2));
    }

    let right = left.split("").reverse().join("");
    return left + "0" + right;
}