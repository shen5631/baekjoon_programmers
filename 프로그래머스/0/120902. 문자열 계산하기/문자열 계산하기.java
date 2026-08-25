import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(my_string);
        int cnt = st.countTokens();
        String check;
        int pm = 0;
        int number [] = new int [cnt/2+1];
        int kiho [] = new int [cnt/2];
        int a = 0;
        int kiho_ch = 0;
        
        for(int i = 0 ; i < cnt ; i++){
            check = st.nextToken();
            if(check.equals("+")){
                kiho[kiho_ch++]=1;
            }
            else if(check.equals("-")){
                kiho[kiho_ch++]=2;
            }
            else{
                number[a++] = Integer.parseInt(check);
            }
        }   
        kiho_ch=0;
        answer = number[0];
        for(int i = 1 ; i < number.length ; i++){
            if(kiho[kiho_ch] == 2){
                answer-=number[i];     
            }
            else{
                answer += number[i];

            }
                kiho_ch++;      
        }
        
        return answer;
    }
}