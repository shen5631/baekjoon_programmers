import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayList<String>list = new ArrayList<>();
        Stack <String> stk = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            list.add(s.charAt(i)+"");
        }
        
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < s.length() ; j++){
                char ch = list.get(j).charAt(0);
                if(ch == '{' || ch == '[' || ch == '('){
                    stk.push(ch+"");
                }
                else{
                    if(!stk.isEmpty()){
                        if(ch - stk.peek().charAt(0) == 2 || ch - stk.peek().charAt(0) == 1){
                            stk.pop();
                        }
                    }
                    else{
                        stk.push("{");
                    }
                }
            }
            if(stk.size() == 0){
                //System.out.println(list);
                answer++;
            }
            stk.clear();
            
            list.add(list.remove(0));
            
        }
        
        return answer;
    }
}