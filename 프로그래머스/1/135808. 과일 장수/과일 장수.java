import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int arr [][] = new int[score.length/m][m];
        Integer new_arr[]= new Integer[score.length];
        
        for(int i = 0 ; i < score.length ; i++){
            new_arr[i]=score[i];
        }
        
        Arrays.sort(new_arr,Comparator.reverseOrder());
        
        for(int i = 0 ; i < score.length ; i++){
            score[i]=new_arr[i];
        }
        
        for(int i = 0 ; i < score.length/m*m ; i++){
            arr[i/m][i%m]=score[i];
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            answer+=arr[i][arr[i].length-1]*m;
        }
        
        return answer;
    }
}