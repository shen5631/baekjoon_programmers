class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int cnt=0;
        int a,b;
        
        if(sides[0] > sides[1]){
            a = sides[0];
            b = sides[1];
        }
        else{
            a = sides[1];
            b = sides[0];
        }
        
        
        for(int i = a ; i <= a+b ;i++)
            cnt++;
        for(int i = a+b ; i > a ; i--)
            cnt++;
        return cnt-2;
    }
}