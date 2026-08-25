import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0 ;
        int b = 0;
        int a = 0;
        int temp = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }
        if(cnt == 0){
            b = 1;
            cnt = 1;
        }
        int[] answer = new int [cnt];
        if(b == 1){
            answer[0]=-1;
        }
        else{
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i]%divisor==0){
                    answer[a++]=arr[i];
                }
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}