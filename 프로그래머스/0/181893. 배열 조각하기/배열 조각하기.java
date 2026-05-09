import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        ArrayList <Integer> a = new ArrayList<>();
        
        int index = 0;
        int get = 0;
        
        for(int i = 0 ; i< arr.length ; i++){
            a.add(arr[i]);
        }
        
        for(int i = 0; i < query.length ; i++){
            if(i%2==0){
                for(int j = a.size()-1 ; j>= query[i]+1 ; j--){
                    a.remove(j);
                }
                
            }
            else{
                for(int j = query[i]-1 ; j>=0 ; j--){
                    a.remove(j);
                }
            }
            // for(int j = 0 ; j < a.size() ; i++){
            //     if(a.get(j) == -1){
            //         a.remove(j);
            //     }
            // }
            // System.out.println(a);
        }
        

        int[] answer = new int [a.size()];
        for(int i = 0 ; i < a.size() ; i++){
            answer[i] = a.get(i);
        }
        
        return answer;
    }
}