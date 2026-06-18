import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        boolean bln = false;
        String str[] = new String[s.length()];
        s=s.toLowerCase();
        
        for(int i = 0 ;i < str.length ; i++){
            str[i]=s.charAt(i)+"";
        }
        
        if(!str[0].equals(" ")){
            str[0]=str[0].toUpperCase();
        }
        
        for(int i = 0 ; i < str.length ; i++){
            if(str[i].equals(" ")){
                bln=true;
            }
            else if(bln){
                str[i] = str[i].toUpperCase();
                bln=false;
            }
        }
        System.out.println(Arrays.toString(str));
        for(int i = 0 ;i < str.length ; i++){
            answer+=str[i];
        }
        return answer;
    }
}