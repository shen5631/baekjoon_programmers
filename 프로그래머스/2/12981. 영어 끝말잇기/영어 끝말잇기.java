import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int [2];
        String last_words = words[0].charAt(0)+"";

        HashMap<String,Integer> map = new HashMap<>();
        
       for(int i = 0 ;i < words.length ;i++){
           
           if(i != 0){
               last_words = words[i-1].charAt(words[i-1].length()-1)+"";
           }
           
           
           if(map.containsKey(words[i])){
               answer[0]=(((i+1)%n)== 0 ) ? n : (i+1)%n;
               answer[1]=1+i/n;
               break;
           }
           if(!last_words.equals(words[i].charAt(0)+"")){
               answer[0]=(((i+1)%n)== 0 ) ? n : (i+1)%n;
               answer[1]=1+i/n;
               
               System.out.println(words[i-1]+" "+words[i]);
               break;
           }
           else{
               map.put(words[i],i);
           }
       }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");

        return answer;
    }
}