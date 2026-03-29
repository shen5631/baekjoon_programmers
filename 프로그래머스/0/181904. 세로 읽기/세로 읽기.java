import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String a []=new String[my_string.length()/m];
        int b = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            a[i]="";
        }
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < m ; j++ ){
                a[i]+=my_string.charAt(b++)+"";
            }
        }
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0 ; i < a.length ; i++){
            answer += a[i].charAt(c-1)+"";
        }
        return answer;
    }
}