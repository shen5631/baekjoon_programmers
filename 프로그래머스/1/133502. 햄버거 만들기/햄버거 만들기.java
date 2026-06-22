import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int cnt=0;
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer>stk = new Stack<>();
        
        for(int i = 0 ; i < ingredient.length ; i++){
            if(ingredient[i] == 1){
                for(int j = 3 ; j >= 1 ; j--){
                    if(!stk.isEmpty()){
                        if(stk.peek() == j){
                            cnt++;
                            list.add(stk.pop());
                        }
                    }
                    else{
                        break;
                    }
                }
                if(cnt==3){
                    answer++;
                }
                else{
                    for(int j = list.size()-1 ; j >= 0 ; j--){
                        stk.push(list.get(j));
                    }
                    stk.push(1);
                }
                list.clear();
                cnt=0;
            }
            else{
                stk.push(ingredient[i]);
            }
            //System.out.println(stk);
        }
        
        //System.out.println(stk);
        
        return answer;
    }
}