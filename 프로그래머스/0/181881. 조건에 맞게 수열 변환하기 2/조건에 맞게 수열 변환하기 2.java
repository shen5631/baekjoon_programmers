import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean check = true;
        int cnt = 0;
        do{
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= 50 && arr[i] % 2==0){
                    arr[i]/=2;
                    cnt++;
                }
                else if(arr[i] < 50 && arr[i] % 2==1){
                    arr[i]*=2;
                    arr[i]++;
                    cnt++;
                }
            }
            if(cnt == 0){
                check =false;
            }
            else{
                cnt=0;
            }
            answer++;
            // System.out.println(Arrays.toString(arr));
            
        }while(check);
        return answer-1;
    }
}