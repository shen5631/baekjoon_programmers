import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(!map.containsKey(arr[i])){
                a.add(arr[i]);
                map.put(arr[i],arr[i]);
            }
        }
        
        int[] answer = new int[k];
        
        for(int i = 0 ; i < k ; i++){
            if(a.size() > i){
                answer[i] = a.get(i);
            }
            else{
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}