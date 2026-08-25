class Solution {
    public int solution(int chicken) {
        int answer = 0;
        for(int i = 0 ; chicken>9 ; i++){
            chicken-=10;
            answer++;
            chicken++;
        }
        return answer;
    }
}