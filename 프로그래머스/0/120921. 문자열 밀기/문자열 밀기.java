import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp = "";
        String start_temp = "";
        String arr [] = new String[A.length()];
        String check_arr [] = new String[B.length()];
        boolean check = true;
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = A.charAt(i)+"";
        }
        for(int i = 0 ; i < arr.length ; i++){
            check_arr[i] = B.charAt(i)+"";
        }
        
        for(int i = 0 ;i < arr.length ; i++){
            for(int j = arr.length-1 ; j >= 0  ; j--){
                if(j == arr.length-1){
                    start_temp = arr[j];
                }
                if(j==0){
                    arr[j] = start_temp;
                }
                else{
                    arr[j] = arr[j-1];
                }
            }
            for(int j = 0 ; j < arr.length ; j++){
                if(!(check_arr[j] .equals(arr[j])) ){
                    System.out.println(arr[j]+" "+check_arr[j]);
                    check=false;
                }
            }
            if(check){
                
                answer=i+1;
                break;
            }
            else{
                check=true;
            }
            System.out.println(Arrays.toString(arr));
        }
        
        if(answer == A.length()){
            answer=0;
        }
        
        return answer;
    }
}