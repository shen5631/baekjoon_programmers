import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0 ; i < babbling.length ; i++){
            babbling[i] = babbling[i].replaceAll("((aya){2,})","*");
            babbling[i] = babbling[i].replaceAll("((ye){2,})","*");
            babbling[i] = babbling[i].replaceAll("((woo){2,})","*");
            babbling[i] = babbling[i].replaceAll("((ma){2,})","*");
        }
        
        for(int i = 0 ; i < babbling.length ; i++){
            for(int h = 0 ; h < 20 ; h++){
                babbling[i] = babbling[i].replaceFirst("(\\b(aya))","");
                babbling[i] = babbling[i].replaceFirst("(\\b(ye))","");
                babbling[i] = babbling[i].replaceFirst("(\\b(woo))","");
                babbling[i] = babbling[i].replaceFirst("(\\b(ma))","");
            }
        }
        
        for(int i = 0 ; i < babbling.length ; i++){
            if(babbling[i].equals("")) answer++;
        }
        
        System.out.println(Arrays.toString(babbling));
        
        return answer;
    }
}