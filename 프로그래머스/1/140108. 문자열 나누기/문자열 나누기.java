class Solution {
    public int solution(String s) {
        int answer = 0;
        int first_cnt=0;
        int cnt=0;
        String first="";
        boolean check = true;
        for(int i = 0 ; i < s.length() ; i++){
            String str = s.charAt(i)+"";
            
            if(check){
                first = str;
                check = false;
            }
            
            if(first.equals(str)){
                first_cnt++;
            }
            else{
                cnt++;
            }
            
            if(cnt==first_cnt){
                check=true;
                answer++;
                cnt=0;
                first_cnt=0;
            }
        }
        
        if(first_cnt != 0){
            answer++;
        }
        return answer;
    }
}