import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int arr [] = new int [number];
        int cnt =0;
        
        
        for(int i = 1 ; i <= number ; i++){
            for(int j = 1 ; j * j <= i ; j++){
                if(i%j == 0){
                    cnt++;
                    if(j*j!=i){
                        cnt++;
                    }
                }
            }
            arr[i-1]=cnt;
            cnt=0;
        }
        
        //System.out.println(Arrays.toString(arr));
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > limit){
                arr[i] = power;
            }
        }
        
        //System.out.println(Arrays.toString(arr));
        
        for(int i = 0 ; i < arr.length ; i++){
            answer+=arr[i];
        }
        return answer;
    }
}