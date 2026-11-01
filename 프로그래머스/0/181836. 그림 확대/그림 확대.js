function solution(picture, k) {
    var answer = [];
    var str = ["",""];
    for(let i = 0 ; i < k ; i++){
        str[0] += ".";
        str[1] += "x";
    }
    for(let i = 0 ; i < picture.length ; i++){
        let temp = ""
        for(let j = 0 ; j < picture[i].length ; j++){
            if(picture[i].charAt(j) === "x") temp += str[1];
            else temp += str[0];
        }
        for(let j = 0 ; j < k ; j++){
            answer.push(temp);
        }  
    }
    return answer;
}