function solution(seoul) {
    const index = seoul.findIndex(name => name.trim().toLowerCase() === "kim");
    return `김서방은 ${index}에 있다`;
}