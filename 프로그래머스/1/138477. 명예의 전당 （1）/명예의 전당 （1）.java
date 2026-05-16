import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        ArrayList <Integer> arr = new ArrayList<>();
        int cnt = -1;
        
        for(int i = 0 ; i < score.length ; i++){
            if(arr.size() < k){
                arr.add(score[i]);
                cnt++;
            }
            else{
                if(score[i]>arr.get(k-1)){
                    arr.remove(k-1);
                    arr.add(score[i]);
                }
            }
            arr.sort(Comparator.reverseOrder());
            
            answer[i]=arr.get(cnt);
        }
        return answer;
    }
}