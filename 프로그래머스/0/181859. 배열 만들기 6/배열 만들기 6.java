import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int check =0;
        Stack <Integer> a = new Stack<>();
        
        for(int i = 0 ; i < arr.length ;){
            
            if(a.size() != 0){
                check = a.peek();
            }
            
            if(a.size() == 0){
                a.add(arr[i]);
                i++;
            }
            else if(check == arr[i]){
                a.pop();
                i++;
            }
            else if(check != arr[i]){
                a.add(arr[i]);
                i++;
            }

        }
        

        Integer[] answer = a.toArray(Integer [] :: new);

        
        int b [] =new int[answer.length];
        
        for(int i = 0 ; i < b.length ; i++){
            b[i] = answer[i];
        }
        
        int c [] = {-1};
        
        if(b.length == 0){
            return c;
        }
        else{
            return b;
        }
    }
}