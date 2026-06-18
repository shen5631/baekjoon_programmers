import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer stk = new StringTokenizer(s," ");
        int cnt = stk.countTokens();
        for(int i = 0 ; i < cnt ; i++){
            String temp = stk.nextToken();
            String str_1 = (temp.charAt(0)+"").toUpperCase();
            String str_2 = temp.substring(1);
            if(i == cnt-1){
                answer+=str_1+str_2;
            }
            else{
                answer+=str_1+str_2+" ";
            }
        }
        return answer;
    }
}