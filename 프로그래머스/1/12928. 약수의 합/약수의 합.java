class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n==0)
            answer = 0;
        
        for(int i = 1 ; i <= n ; i++){
            for(int j = 2 ; j <= n ; j++){
                if(i*j==n){
                    answer+=j;
                    System.out.println(j);
                    break;
                }
            }
        }
        return answer;
    }
}