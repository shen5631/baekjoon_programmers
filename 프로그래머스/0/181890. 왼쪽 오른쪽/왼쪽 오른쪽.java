class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String check="";
        int check_i =0;
        for(int i = 0 ; i < str_list.length ; i ++){
            if(str_list[i].equals("l")){
                check="l";
                check_i=i;
                break;
            }
            else if (str_list[i].equals("r")){
                check="r";
                check_i=i;
                break;
            }
        }
        if(check.equals("l")){
             answer = new String[check_i];
        }
        else if(check.equals("r")){
            answer = new String[str_list.length - check_i-1];
        }
        
        int cnt =0;
        
        if(check.equals("l")){
             for(int i = 0 ; i < check_i ; i++){
                 answer[cnt++]=str_list[i];
             }
        }
        else if(check.equals("r")){
            for(int i = check_i+1 ; i < str_list.length ; i++){
                 answer[cnt++]=str_list[i];
             }
        }
        
        return answer;
    }
}