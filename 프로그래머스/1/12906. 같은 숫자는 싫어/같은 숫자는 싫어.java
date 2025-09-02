import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        int cnt = 1;
        int a = 0;
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]!=arr[i+1])
                cnt++;
        }
        int[] answer = new int [cnt];
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]!=arr[i+1])
                answer[a++]=arr[i];
        }        
        answer[answer.length-1]=arr[arr.length-1];
        return answer;
    }
}