function solution(s) {
    return s
    .split("")
    .sort((a, b) => (a < b ? 1 : -1)) //내림차순
    .join("")
}