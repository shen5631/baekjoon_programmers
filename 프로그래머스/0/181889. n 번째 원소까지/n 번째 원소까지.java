class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [n];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i]=num_list[i];
        }
        if(answer.length==1)
            answer[0]=num_list[0];
        return answer;
    }
}