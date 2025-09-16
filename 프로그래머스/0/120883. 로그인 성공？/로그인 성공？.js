function solution(id_pw, db) {
    const [inputId, inputPw] = id_pw;
    
    for (let [id, pw] of db) {
        if (id === inputId) {
            if (pw === inputPw){
                return "login";
            } else {
                return "wrong pw";
            }
        }
    }
    return "fail";
}