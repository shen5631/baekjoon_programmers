import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack <Integer> a = new Stack <>();
        
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                a.push(1);
            }
            else{
                if(a.size() == 0){
                    return false;
                }
                else{
                    a.pop();
                }
            }
        }
        
        if(a.size() != 0){
            return false;
        }
        
        return answer;
    }
}