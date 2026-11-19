function solution(my_string, n) {
    var answer = '';
    for(let a of my_string){
        for(let i = 0 ; i < n ; i++){
            answer+=a;
        }
    }
    return answer;
}