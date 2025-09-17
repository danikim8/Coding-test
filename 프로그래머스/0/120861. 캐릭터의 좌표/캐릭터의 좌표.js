function solution(keyinput, board) {
    let x=0, y = 0;
    
    //보드에서 가능한 최대 좌표 범위
    const xLimit = Math.floor(board[0] / 2);
    const yLimit = Math.floor(board[1] / 2);
    
    for (let key of keyinput){
        if (key === "up" && y < yLimit ){
            y += 1;
        } else if (key === "down" && y > -yLimit){
            y -= 1;
        } else if (key === "right" && x < xLimit){
            x += 1;
        } else if (key === "left" && x > -xLimit){
            x -= 1;
        }
    }
    return [x,y];
}