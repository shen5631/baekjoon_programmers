class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int a = k;
        for(int i = 0 ; i < answer.length ; i++){
            answer[i]=a;
            a+=k;
        }
        return answer;
    }
}