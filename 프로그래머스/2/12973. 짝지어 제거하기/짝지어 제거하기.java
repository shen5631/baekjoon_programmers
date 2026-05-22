import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<String> stk = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(stk.size() != 0 && (s.charAt(i)+"").equals(stk.peek())){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i)+"");
            }
        }
        
        System.out.println(stk);

        if(stk.size() == 0){
            answer=1;
        }
        return answer;
    }
}