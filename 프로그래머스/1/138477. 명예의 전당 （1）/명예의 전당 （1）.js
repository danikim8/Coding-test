function solution(k, score) {
    const hallOfFame = [];
    const result = [];

    for (let i = 0; i < score.length; i++) {
        // 새로운 점수 추가
        hallOfFame.push(score[i]);

        // 내림차순 정렬
        hallOfFame.sort((a, b) => b - a);

        // 상위 k명만 유지
        if (hallOfFame.length > k) {
            hallOfFame.pop();
        }

        // 현재 명예의 전당 최하위 점수 = 마지막 원소
        result.push(hallOfFame[hallOfFame.length - 1]);
    }

    return result;
}