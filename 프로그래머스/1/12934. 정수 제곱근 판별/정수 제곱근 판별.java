class Solution {
    public long solution(long n) {
        long answer = -1;
        double a = Math.sqrt(n);
        
        if(a % 1 == 0){
            a++;
            answer = (long)(a*a);
        }
        
        return answer;
    }
}