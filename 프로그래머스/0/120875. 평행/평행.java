

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double a  = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        
        
        a = (double)(dots[1][1] - dots[0][1])/(dots[1][0] - dots[0][0]);
        
        b = (double)(dots[3][1] - dots[2][1])/(dots[3][0] - dots[2][0]);
        
        c = (double)(dots[2][1] - dots[0][1])/(dots[2][0] - dots[0][0]);
        
        d = (double)(dots[3][1] - dots[1][1])/(dots[3][0] - dots[1][0]);
        // c = (dots[3][1] - dots[1][1])/(dots[3][0] - dots[1][0]);
        // d = (dots[2][1] - dots[0][1])/(dots[2][0] - dots[0][0]);
        
        
        if(a == b){
            answer=1;
        }
        else if(c == d){
            answer=1;
        }

        System.out.println(a+" "+b);

        return answer;
    }
}