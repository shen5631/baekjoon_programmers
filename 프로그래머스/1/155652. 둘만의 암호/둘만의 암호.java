import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char ch [] = new char [skip.length()];
        
        
        for(int i = 0 ;i < skip.length() ; i++){
            ch[i] = skip.charAt(i);
        }
        
        Arrays.sort(ch);
        
        for(int i = 0 ; i < s.length() ; i++){
            char str = s.charAt(i);
            
            for(int j = 0 ; j < index ; j++){
                str++;
                if(str > 122){
                    str='a';
                }
                for(int k = 0 ; k < ch.length ; k++){
                    if(str == ch[k]){
                        str++;
                    }
                    if(str > 122){
                        str='a';
                    }
                }
                for(int k = 0 ; k < ch.length ; k++){
                    if(str == ch[k]){
                        str++;
                    }
                    if(str > 122){
                        str='a';
                    }
                }
            }
            
            System.out.println(str);
            answer+=str+"";
        }
        
        return answer;
    }
}