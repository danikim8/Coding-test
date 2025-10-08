function solution(numbers, hand) {
    const keypad = {
        1:[0,0], 2:[0,1], 3:[0,2],
        4:[1,0], 5:[1,1], 6:[1,2],
        7:[2,0], 8:[2,1], 9:[2,2],
        '*':[3,0], 0:[3,1], '#':[3,2]
    };
    
    let leftPos = keypad['*'];
    let rightPos = keypad['#'];
    let result = '';
    
    for (let num of numbers){
        const [x, y] = keypad[num];
        
        if(y === 0) {
            result += 'L';
            leftPos = [x, y];
        }
        else if(y === 2){
            result += 'R';
            rightPos = [x, y];
        }
        else {
            const leftDist = Math.abs(leftPos[0] - x) + Math.abs(leftPos[1] - y);
            const rightDist = Math.abs(rightPos[0] - x) + Math.abs(rightPos[1] - y);
            
            if (leftDist < rightDist) {
                result += 'L';
                leftPos = [x,y];
            }
            else if (leftDist > rightDist){
                result += 'R';
                rightPos = [x,y];
            }
            else { // equal
                if (hand === 'left') {
                    result += 'L';
                    leftPos = [x,y];
                } else {
                    result += 'R';
                    rightPos = [x,y];
                }
            }
        }
    }
    
    return result;
}