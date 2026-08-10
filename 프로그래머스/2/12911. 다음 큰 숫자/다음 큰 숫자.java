class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=Integer.bitCount(n);
        
        
        while(true){
            n++;
            int check_cnt=Integer.bitCount(n);
            
            if(check_cnt == cnt){
                answer=n;
                break;
            }
        }
        return answer;
    }
}