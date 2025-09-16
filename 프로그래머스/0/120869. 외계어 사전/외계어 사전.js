function solution(spell, dic) {
    // spell 배열을 정렬해서 문자열로 합침
    const target = spell.sort().join("");
    
    // dic 안의 단어를 하나씩 확인
    for (let word of dic){
        //단어를 정렬해서 비교
        if (word.split("").sort().join("") === target) {
            return 1;
        }
    }
    return 2;
}