function solution(num_list) {
    var answer = 0;
    let str1 = "";
    let str2 = "";
    
    for(let a of num_list){
        if(a % 2 == 0){
            str1+=a;
        }
        else{
            str2+=a;
        }
    }
    
    answer = Number(str1) + Number(str2);
    
    return answer;
}