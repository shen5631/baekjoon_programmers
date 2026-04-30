import java.util.*;
class Solution {
    public int solution(int n) {
        Stack <Integer> stk = new Stack<>();
        int answer = 0;
        int jin = 0;
        
        do{
            stk.push(n%3);
            n/=3;
            
        }while(n>2);
        if(n!= 0){
            stk.push(n);
        }
        
        
        System.out.println(stk);
        
        int arr [] = new int[stk.size()];
        
        for(int i = 0 ; i < stk.size() ; i++){
            arr[i] = stk.get(i);
        }
        
        System.out.println(Arrays.toString(arr));
        
        boolean cnt = false;
        
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i] != 0){
                cnt = true;
                System.out.println("i : "+i);
            }
            
            if(cnt && arr[i] == 0){
                answer*=3;
            }
            else if(cnt && arr[i] == 1 ){
                answer*=3;
                answer++;
            }
            else if(cnt&& arr[i] ==2 ){
                answer*=3;
                answer+=2;
            }
            System.out.println(answer);
        }
        return answer;
    }
}