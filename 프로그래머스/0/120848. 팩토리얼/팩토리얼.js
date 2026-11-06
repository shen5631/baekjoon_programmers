function solution(n) {
    let pat = [0,1,2,6,24,120,720,5040,40320,362880,3628800];
    var answer = 0;
    for(let i =0; i < pat.length ; i++){
        
        if(pat[i] === n){
            answer = i;
            break;
        }
        else if(pat[i] < n){
            answer = i;
        }
    }
    
    
    return answer;
}