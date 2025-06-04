class Solution {
    public int[] solution(int n) {
        int a = 0;
        int b = 0;
        for(int i = 1 ; i <= n ; i++)
            for(int j = 0 ; j <=n ; j++)
                if(i*j==n)
                a++;
            
            int[] answer = new int [a];
        for(int i = 1 ; i <= n ; i++)
            for(int j = 0 ; j <=n ; j++)
                if(i*j==n){
                answer[b]=i;
                b++;
                }
                
        return answer;
    }
}