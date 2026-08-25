class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a)+String.valueOf(b);
        int b1 = Integer.parseInt(a1);
        
        if(b1 > 2*a*b)
            answer=b1;
        else
            answer=2*a*b;
        return answer;
    }
}