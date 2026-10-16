import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int cnt = 27;
        
        HashMap <String,Integer> word = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 1 ; i <= 26 ; i++){
            word.put(((char)('A'+i-1))+"", (Integer)i);
        }
        
        for(int i = 0 ; i < msg.length() ; i++){
            String temp="";
            int length_cnt = 0;
            for(int j = i ; j < msg.length() ; j++){
                temp += msg.charAt(j)+"";
                
                if(!word.containsKey(temp)){
                    word.put(temp,cnt++);
                    length_cnt--;
                    break;
                }
                
                if(j+1 == msg.length()){
                    temp+="1";
                }
                length_cnt++;
            }
            System.out.println(temp);
            i+=length_cnt;
            if(temp.length() == 1){
                list.add(word.get(temp));
            }
            else{
                list.add(word.get(temp.substring(0,temp.length()-1)));  
            }

        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}