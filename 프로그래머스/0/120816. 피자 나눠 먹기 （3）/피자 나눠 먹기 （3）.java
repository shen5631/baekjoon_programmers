class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int a = slice;
        for( ; slice <  n ; slice+=a)
            ++answer;
        return answer;
    }
}