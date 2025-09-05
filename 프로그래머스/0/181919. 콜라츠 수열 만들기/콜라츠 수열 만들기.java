class Solution {
    public int[] solution(int n) {
        int cnt = 1;
        int a = 1;
        for(int i = n ; i != 1 ;){
            if(i%2==0){
                i=i/2;
                cnt++;
            }
            else{
                i=i*3+1;
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        answer[0]=n;
        for(int i = n ; i != 1 ;){
            if(i%2==0){
                i=i/2;
                answer[a++]=i;
            }
            else{
                i=i*3+1;
                answer[a++]=i;
            }
        }
        return answer;
    }
}