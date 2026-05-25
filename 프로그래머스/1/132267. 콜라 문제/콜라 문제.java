class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cnt=0;
        int cnt1=0;
        while(n>=a){
            cnt=n%a;
            cnt1=n/a*b;
            n=cnt1+cnt;
            answer+=cnt1;
            
            
        }
        return answer;
    }
}