import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int back = 0;
        String a;
        StringTokenizer st = new StringTokenizer (s);
        int cnt = st.countTokens();
        for(int i = 0 ; i < cnt; i++){
            a=st.nextToken();
            if(a.equals("Z")){
                answer-=back;
                System.out.println("a");
            }
            else{
                answer+=Integer.parseInt(a);
                back = Integer.parseInt(a);
            }
            System.out.println(answer);
        }
        return answer;
    }
}