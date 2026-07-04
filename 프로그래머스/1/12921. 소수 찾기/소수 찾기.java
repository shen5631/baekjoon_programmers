import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean a [] = new boolean[n+1];
        
        a[0]=true;
        a[1]=true;
        

            for (int i = 2; i * i <= n; i++) {
                if (!a[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        a[j] = true; 
                    }
                }
            }

        
        for(int i = 0 ; i < a.length ; i++){
            if(!a[i]){
                answer++;
            }
        }
        
        //System.out.println(Arrays.toString(a));
        
        return answer;
    }
}