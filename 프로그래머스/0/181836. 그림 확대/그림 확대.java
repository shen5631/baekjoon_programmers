class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String [picture.length*k];
        int a = 0;
        
        for(int i = 0 ; i < answer.length ; i++){
            answer[i]="";
        }
        for(int i = 0  ; i < answer.length ; i++){
            for(int j = 0 ; j < picture[a/k].length() ; j++){
                for(int jj = 0 ; jj < k ; jj++){
                    answer[i]+=picture[a/k].charAt(j)+"";
                }
            }
            a++;
        }
        return answer;
    }
}