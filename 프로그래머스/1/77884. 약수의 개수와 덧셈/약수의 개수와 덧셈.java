class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for(int k = left ; k <= right ; k++){
            for(int i = 1 ; i <= k ; i++){
                for(int j = 1 ; j <= k ; j++){
                    if(i*j==k){
                        cnt++;
                    }
                }
            }
            if(cnt%2==0){
                answer+=k;
            }
            else{
                answer-=k;
            }
            System.out.println(answer);
            cnt=0;
        }
        return answer;
    }
}