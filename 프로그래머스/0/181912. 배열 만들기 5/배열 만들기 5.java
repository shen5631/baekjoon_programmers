import java.util.*;
class Solution {
    public long[] solution(String[] intStrs, int k, int s, int l) {
        String n_s []= new String[intStrs.length];
        String n_str []= new String[intStrs.length];
        int cnt=0;
        
        for(int i = 0 ; i < n_s.length ; i ++){
            n_s[i] = "";
        }
        for(int i = 0 ; i < n_s.length ; i ++){
            n_str[i] = "";
        }
        
        //문자열 구분
        for(int i = 0 ; i < intStrs.length ; i++){
            for(int j = 0 ; j < intStrs[i].length() ; j++){
                if(j >= s){
                    n_s[i] += intStrs[i].charAt(j);
                }
            }
        }
        
        //문자열 ~짜르기
        for(int i = 0 ; i < n_s.length ; i++){
            for(int j = 0 ; j < l ; j++){
                n_str[i] += n_s[i].charAt(j)+"";
            }
        }
        
        cnt=0;
        
        
        //값비교
        for(int i = 0 ; i < n_s.length ; i++){
            if(Long.parseLong(n_str[i]) > k){
                cnt++;
            }
        }
        
        //넘는것만 추가
        long[] answer = new long[cnt];
        cnt=0;
        for(int i = 0 ; i < n_s.length ; i++){
            if(Long.parseLong(n_str[i]) > k){
                answer[cnt++] = Long.parseLong(n_str[i]);
            }
        }
        
        return answer;
    }
}