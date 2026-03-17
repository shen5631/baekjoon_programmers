class Solution {
    public String solution(String my_string) {
        String answer = "";
        int up_abc [] = new int [26];
        int down_abc [] = new int [26];
        char ms [] =new char [my_string.length()];
        int space = 0;
        
        for(int i = 0 ; i < ms.length ; i++){
            ms[i] = my_string.charAt(i);
        }
        
        for(int i = 0 ; i < ms.length ; i++){
            for(int j = 0 ; j < up_abc.length ; j++){
                if((int)ms[i] == j+ 97){
                    down_abc[j]++;
                }
            }
            for(int j = 0 ; j < up_abc.length ; j++){
                if((int)ms[i] == j+65){
                    up_abc[j]++;
                }
            }
        }
        
        for(int i = 0 ; i < ms.length ; i++){
            for(int j = 0 ; j < up_abc.length ; j++){
                if(((int)ms[i]) >= 97){
                    if(((int)ms[i]) == 97+j){
                        if(down_abc[j] > 0 ){
                            answer+=((char)(97+j))+"";
                            down_abc[j] = -200;
                        }
                    }
                }
                else if(ms[i]==' ' && space == 0){
                    answer+=" ";
                    space++;
                }
                else{
                    if(((int)ms[i]) == 65+j){
                        if(up_abc[j] > 0 ){
                            answer+=((char)(65+j))+"";
                            up_abc[j] = -200;
                        }
                    }
                }
            }
        }
        return answer;
    }
}