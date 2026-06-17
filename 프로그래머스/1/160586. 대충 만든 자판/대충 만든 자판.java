import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        int arr [] = new int[26];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]=101;
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < keymap.length ; j++){
                if(arr[i] > keymap[j].indexOf(65+i) && keymap[j].indexOf(65+i) != -1){
                    arr[i]= keymap[j].indexOf(65+i);
                }
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 101){
                arr[i]=-1;
            }
        }
        
        for(int j = 0 ; j < targets.length ; j++){
            for(int k = 0 ; k < targets[j].length() ; k++){
                if(arr[targets[j].charAt(k)-65] != -1){
                    answer[j]+= arr[targets[j].charAt(k)-65]+1;
                }
                else{
                    answer[j]=-1;
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}