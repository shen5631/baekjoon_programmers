function solution(s1, s2) {
    var answer = s1.filter((i) =>{
        return s2.indexOf(i) != -1;
    }).length
    return answer;
}