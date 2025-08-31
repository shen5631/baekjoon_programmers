import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0 ;
        int b = 0;
        int a [] = new int [arr.length];
        if(arr.length == 1){
            cnt=1;
        }
        else{
            cnt = arr.length-1;
        }
        int answer [] = new int [cnt];
        if(arr.length == 1){
            answer[0]=-1;
        }
        else{
            cnt = arr.length-1;
        }
        for(int i = 0 ; i < a.length ; i++){
            a[i]=arr[i];
        }
        Arrays.sort(a);
        b = a[0];
        int c = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            if(arr[i]!=b){
                answer[c++]=arr[i];
            }
        }
        
        
        return answer;
    }
}