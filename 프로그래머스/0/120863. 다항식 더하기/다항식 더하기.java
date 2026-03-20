import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int y = 0;
        int cc = 0;
        StringTokenizer st = new StringTokenizer(polynomial);
        int cnt = st.countTokens();
        String check = st.nextToken();
        
        for(int j = 0 ; j < cnt;){
            for(int i = 0 ; i < check.length() ; i++){
                if((check.charAt(i)+"").equals("x")){
                    check = check.replace("x","");
                    if(check.equals("")){
                        x++;
                    }
                    else{
                        x += Integer.parseInt(check);
                    }
                    cc++;
                }


            }
            if(check.equals("+") && cc == 0){
                    
            }
            else if(cc == 0){
                y += Integer.parseInt(check);
            }
            cc=0;
            j++;
            if( j < cnt){
                check = st.nextToken(); 
            }

        }
        
        if(x == 0){
            answer = String.valueOf(y);
        }
        else if(y == 0){
            if(x == 1){
                answer = "x";
            }
            else{
                answer = String.valueOf(x)+"x";
            }
        }
        else{
            if(x == 1){
                answer = "x + "+String.valueOf(y);
            }
            else{
                answer = String.valueOf(x)+"x + "+String.valueOf(y);
            }
        }
        System.out.println(x + " " + y);        
        return answer;
    }
}