function solution(N, stages) {
    let players = stages.length;
    const result = [];
    
    for(let i=1; i<=N; i++){
        //현재 스테이지에 머문 사람
        let fail = stages.filter(stage => stage === i).length;
        //실패율
        let rate = players === 0 ? 0 : fail / players;
        result.push({stage : i, rate: rate});
        //다음 스테이지 도전자 수 줄이기
        players -= fail;
    }
    
    //실패율 내림차순, 같으면 스테이지 번호 오름차순
    result.sort((a,b) => {
        if (b.rate === a.rate) return a.stage - b.stage;
        return b.rate - a.rate;
    });
    
    return result.map(item => item.stage);
}