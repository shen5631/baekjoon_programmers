import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        int check;
        do{
            if(s.size() == 0){
                s.push(arr[i]);
                i++;
            }
            check = s.pop();
            if(arr[i]>check){
                s.push(check);
                s.push(arr[i]);
                i++;
            }
            else if(arr[i]<=check){
                
            }
            else{
                s.push(check);
            }
        }while(i != arr.length);
        
        int stk[] = new int[s.size()];
        
        for(int j = stk.length-1 ; j >= 0 ; j--){
            stk[j] = s.pop();
        }
        
        
        return stk;
    }
}