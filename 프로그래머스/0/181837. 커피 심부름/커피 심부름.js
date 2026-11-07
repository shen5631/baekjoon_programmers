function solution(order) {
    var answer = 0;
    for(let a of order){
        if(a.indexOf("americano") !== -1 || a.indexOf("anything") !== -1){
            answer+=4500;
        }
        else{
            answer+=5000;
        }
        console.log(answer);
    }
    
    return answer;
}