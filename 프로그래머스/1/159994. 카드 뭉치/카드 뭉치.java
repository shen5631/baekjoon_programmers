import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int card1 [] = new int [cards1.length];
        int card2 [] = new int [cards2.length];
        int a = 0;
        int a_cnt = 0;
        int b_cnt = 0;
        
        boolean check =false;
        
        for(int i = 0 ; i < card1.length ; i++){
            card1[i]=-1;
        }
        for(int i = 0 ; i < card2.length ; i++){
            card2[i]=-1;
        }
        
        for(int i = 0 ; i < goal.length ; i++){
            for(int j = 0 ; j < cards1.length ; j++){
                if(cards1[j].equals(goal[i])){
                    card1[a++]=j;
                }
            }
        }
        
        for(int i = 0 ; i < goal.length ; i++){
            for(int j = 0 ; j < cards1.length ; j++){
                if(cards1[j].equals(goal[i])){
                    a_cnt++;
                }
            }
        }
        
        for(int i = 0 ; i < goal.length ; i++){
            for(int j = 0 ; j < cards2.length ; j++){
                if(cards2[j].equals(goal[i])){
                    b_cnt++;
                }
            }
        }
        
        
        
        a=0;
        
        for(int i = 0 ; i < goal.length ; i++){
            for(int j = 0 ; j < cards2.length ; j++){
                if(cards2[j].equals(goal[i])){
                    card2[a++]=j;
                }
            }
        }
        
        int cnt=0;
        
        a=0;
        
        for(int i = 0 ; i < card1.length ; i++){
            if(card1[i] == a++){
                cnt++;
            }
        }
        
        if(a_cnt == cnt)
            check=true;
        if(cnt == 0)
            check=true;
        
        System.out.println(cnt);
        
        cnt=0;
        
        a=0;
        
        
        for(int i = 0 ; i < card2.length ; i++){
            if(card2[i] == a++){
                cnt++;
            }
        }
        
        System.out.println(cnt);
        
        
        
        if(b_cnt == cnt && check){
            check=true;            
        }
        else{
            check=false;            
        }
        
        if(check){
            answer="Yes";
        }
        else{
            answer="No";
        }

        
        
        
        
        System.out.print(check);
        return answer;
    }
}