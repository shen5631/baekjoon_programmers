class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        
        if(Math.abs(dots[0][0] - dots[1][0]) == Math.abs(dots[2][0] - dots[3][0]) && Math.abs(dots[0][0] - dots[1][0])!= 0){
            x = Math.abs(dots[0][0] - dots[1][0]);
            System.out.println("!");
        }
        
        else if(Math.abs(dots[0][0] - dots[2][0]) == Math.abs(dots[1][0] - dots[3][0]) && Math.abs(dots[0][0] - dots[2][0])!= 0){
            x = Math.abs(dots[0][0] - dots[2][0]);
            System.out.println("!");
        }
        else if(Math.abs(dots[0][0] - dots[3][0]) == Math.abs(dots[2][0] - dots[1][0]) && Math.abs(dots[0][0] - dots[3][0])!= 0){
            x = Math.abs(dots[0][0] - dots[3][0]);
            System.out.println("!");
        }
        
        System.out.println(Math.abs(dots[0][0] - dots[1][0]) +" "+ Math.abs(dots[2][0] - dots[3][0]));
        System.out.println(Math.abs(dots[0][0] - dots[2][0]) +" "+ Math.abs(dots[1][0] - dots[3][0]));
        System.out.println(Math.abs(dots[0][0] - dots[3][0]) +" "+ Math.abs(dots[2][0] - dots[1][0]));
        System.out.println();
        
        
        if(Math.abs(dots[0][1] - dots[1][1]) == Math.abs(dots[2][1] - dots[3][1]) && Math.abs(dots[0][1] - dots[1][1])!= 0){
            y = Math.abs(dots[0][1] - dots[1][1]);
            System.out.println("?");
        }
        else if(Math.abs(dots[0][1] - dots[2][1]) == Math.abs(dots[1][1] - dots[3][1]) && Math.abs(dots[0][1] - dots[2][1])!= 0){
            y = Math.abs(dots[0][1] - dots[2][1]);
            System.out.println("?");
        }
        else if(Math.abs(dots[0][1] - dots[3][1]) == Math.abs(dots[2][1] - dots[1][1]) && Math.abs(dots[0][1] - dots[3][1])!= 0){
            y = Math.abs(dots[0][1] - dots[3][1]);
            System.out.println("?");
        }
        
        
        System.out.println(Math.abs(dots[0][1] - dots[1][1]) +" "+ Math.abs(dots[2][1] - dots[3][1]));
        System.out.println(Math.abs(dots[0][1] - dots[2][1]) +" "+ Math.abs(dots[1][1] - dots[3][1]));
        System.out.println(Math.abs(dots[0][1] - dots[3][1]) +" "+ Math.abs(dots[2][1] - dots[1][1]));
        
        System.out.println(x+" "+y);
        
        answer = x*y;
        return answer;
    }
}
