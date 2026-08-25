class Solution {
    public int solution(int n) {
        int answer=0;
        int a=0;
        
        for(int i=1;a<n;i++){
            a=i*i;
            if(a==n)
                answer=1;
            else if(a>n)
                answer=2;
        }
            
        return answer;
    }
}