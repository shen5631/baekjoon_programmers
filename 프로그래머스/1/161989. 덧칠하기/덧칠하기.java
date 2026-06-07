import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int arr [] = new int[n];
        int cnt=0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < section.length ; j++){
                if(i == section[j]-1){
                    arr[i]=1;
                }
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                for(int j = i ; j <i+m ; j++){
                    if(j >= arr.length) break;
                    arr[j]=0;
                }
                answer++;
               //System.out.println(Arrays.toString(arr));
            }
            
        }
        
        //System.out.println(Arrays.toString(arr));
        return answer;
    }
}