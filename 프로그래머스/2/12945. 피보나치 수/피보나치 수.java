class Solution {
    public 
long solution(int n) {
        
long answer = 0;
        long a=0;
        long b=1;
        for(int i = 1 ; i < n ; i++){
            answer=a+b;
            a=b;
            b=answer%1234567;
        }
        return answer%1234567;
    }
}