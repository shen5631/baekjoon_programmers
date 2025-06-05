class Solution {
    public int solution(int n) {
        int answer = 0;
        int p = 6;
        for(int i = 1 ; ;i++){
            if(i*p%n==0){
                answer=i;
                break;
            }
        }
        return answer;
    }
}