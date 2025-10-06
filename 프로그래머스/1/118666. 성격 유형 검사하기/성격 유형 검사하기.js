function solution(survey, choices) {
    const score = {R:0, T:0, C:0, F:0, J:0, M:0, A:0, N:0};
    
    for (let i=0; i<survey.length; i++){
        //RT, CF, JM, AN //dis=R, agree=T
        const [disagree, agree] = survey[i];
        const choice = choices[i];
        
        if (choice < 4){ // disagree
            score[disagree] += 4 - choice;
        }
        else if (choice > 4) { //agree
            score[agree] += choice -4;
        }
    }
    
    let result = "";
    result += score['R'] >= score['T'] ? 'R' : 'T';
    result += score['C'] >= score['F'] ? 'C' : 'F';
    result += score['J'] >= score['M'] ? 'J' : 'M';
    result += score['A'] >= score['N'] ? 'A' : 'N';
    
    return result;
}