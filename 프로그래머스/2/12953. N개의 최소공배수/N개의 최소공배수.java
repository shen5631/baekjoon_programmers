import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int r=1;
        int b;
        int a;
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            a = arr[i];
            b = arr[i+1];
            while(b!=0){
                r=a%b;
                a=b;
                b=r;
            }
            arr[i+1] = arr[i]*arr[i+1]/a; 
            System.out.println(Arrays.toString(arr));
        }
        
        answer = arr[arr.length-1];
        return answer;
    }
}