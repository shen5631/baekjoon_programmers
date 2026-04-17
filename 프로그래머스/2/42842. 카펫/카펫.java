class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int cnt = 0;
        for(int i = 3 ; i <= brown+yellow ; i++ ){
            for(int j = 3 ; j <= brown+yellow ; j++){
                if(i*j == brown+yellow && (i-2)*(j-2) == yellow){
                    answer[0]=j;
                    answer[1]=i;
                    cnt++;
                }
                if(cnt!=0){
                    break;
                }
            }
            if(cnt!=0){
                break;
            }
        }
        return answer;
    }
}