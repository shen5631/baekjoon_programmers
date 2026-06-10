import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String st_cl [] = pos.split(":");
        String tt_cl [] =video_len.split(":");
        String op_s [] = op_start.split(":");
        String op_e [] = op_end.split(":");
        
        System.out.println(Arrays.toString(st_cl));
        System.out.println(Arrays.toString(tt_cl));
        System.out.println(Arrays.toString(op_s));
        System.out.println(Arrays.toString(op_e));
        
        int start = Integer.parseInt(st_cl[0]) * 60 + Integer.parseInt(st_cl[1]);
        int total = Integer.parseInt(tt_cl[0]) * 60 + Integer.parseInt(tt_cl[1]);
        int op_st = Integer.parseInt(op_s[0]) * 60 + Integer.parseInt(op_s[1]);
        int op_en = Integer.parseInt(op_e[0]) * 60 + Integer.parseInt(op_e[1]);
        
        if(start >= op_st && start < op_en){
            start=op_en;
        }
        
        for(int i = 0 ;i< commands.length ;i++){
            if(commands[i].equals("next")){
                if(start +10 > total){
                    start=total;
                }
                else if(start+10 >= op_st && start+10 < op_en){
                    start=op_en;
                }
                else{
                    start+=10;
                }
            }
            else{
                if(start-10 < 0){
                    start=0;
                }
                else if(start-10 >= op_st && start-10 < op_en){
                    start=op_en;
                }
                else{
                    start-=10;
                }
            }
            if(start >= op_st && start < op_en){
                start=op_en;
            }
            System.out.println(start);
        }
        
        
        
        System.out.println(start);
        
        System.out.println(start/60 +" "+start%60);
        
        String m = (String.valueOf(start/60).length() == 1) ? ("0"+String.valueOf(start/60)) : String.valueOf(start/60);
        
        String s = (String.valueOf(start%60).length() == 1) ? ("0"+String.valueOf(start%60)) : String.valueOf(start%60);
        
        String answer = m+":"+s;
        return answer;
    }
}