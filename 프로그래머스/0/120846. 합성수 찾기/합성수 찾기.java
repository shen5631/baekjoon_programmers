class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        for(int k = 1 ; k <= n ; k++){
            cnt=1;
            for(int i = 1 ; i <= k ; i++){
                for(int j = 2 ; j <= k ; j++){
                    if(i*j==k){
                        cnt++;
                        break;
                    }
                }
                if(cnt==3){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}