class Solution {
    public int[] solution(int n) {
        int a = 0;
        int b = 0;
        for(int i = 0 ; i <= n ; i++){
            if(i%2==1)
                a++;
        }
        int[] answer = new int[a];
        for(int i = 0 ; i <= n ; i++){
            if(i%2==1){
                answer[b]=i;
                b++;
            }
        }
        return answer;
    }
}