class Solution {
    public int solution(int n) {
        int a = 7;
        int b = 1;
        int answer = 1;
        for(; n>a ; a+=7){
        answer = ++b;
        }
        return answer;
    }
}