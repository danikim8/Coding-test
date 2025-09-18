function solution(A, B) {
    // 처음부터 같으면
    if(A === B) return 0;

    // B를 두 번 붙이고
    const double = B + B;

    // A가 나오는 첫 인덱스 찾기, 없으면 -1 리턴
    return double.indexOf(A);
}