function solution(board, moves) {
    const basket = []; // 바구니
    let answer = 0; // 터진 인형 개수
    
    for ( let move of moves){
        const col = move - 1;
        
        //열에서 위부터 인형찾기
        for (let row=0; row<board.length; row++){
            if ( board[row][col] !== 0){
                let doll = board[row][col];
                board[row][col] = 0; //뽑고, 비게
                
                if (basket[basket.length -1] === doll){
                    basket.pop();
                    answer += 2;
                } else {
                    basket.push(doll);
                }
                break;// 인형 하나만 뽑고 끝
            }
        }
    }
    
    return answer;
}