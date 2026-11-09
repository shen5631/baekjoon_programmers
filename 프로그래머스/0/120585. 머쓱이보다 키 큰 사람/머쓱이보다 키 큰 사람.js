function solution(array, height) {
    var answer = array.filter((tall)=>{
        return tall > height;
    });
    return answer.length;
}