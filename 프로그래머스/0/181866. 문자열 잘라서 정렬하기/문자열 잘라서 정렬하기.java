import java.util.*;

class Solution {
    public String[] solution(String myString) {

        StringTokenizer st = new StringTokenizer(myString,"x");
        
        int cnt = st.countTokens();
        String[] answer = new String[cnt];
        
        for(int i = 0 ; i < cnt ; i++){
            answer [i] = st.nextToken();
        }
        
        Arrays.sort(answer);
        return answer;
    }
}