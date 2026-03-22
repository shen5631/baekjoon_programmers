import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str ="";
        char a [] = new char [my_string.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=my_string.charAt(i);
        }
        for(int i = 0 ; i < a.length ; i++){
            if( !((int)a[i] <= 57) ){
                a[i] = ' ';
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            str+=a[i]+"";
        }
        StringTokenizer st = new StringTokenizer(str);
        int cnt = st.countTokens();
        for(int i = 0 ; i < cnt ; i++){
            answer += Integer.parseInt(st.nextToken());
        }
        
        return answer;
    }
}