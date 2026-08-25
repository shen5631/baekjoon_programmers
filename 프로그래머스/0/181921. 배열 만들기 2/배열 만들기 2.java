class Solution {
    public int[] solution(int l, int r) {
        String str = "";
        int cnt=0;
        int len_cnt=0;
        for(int i = l ; i <= r ; i++){
            for(int j = 0 ; j < String.valueOf(i).length() ; j++ ){
                str = String.valueOf(i);
                if(str.charAt(j) == '5' || str.charAt(j) == '0'){
                    cnt++;
                }
            }
            if(str.length() == cnt){
                len_cnt++;
            }
            cnt=0;
        }
        int c_cnt=0;
        int[] answer = new int[len_cnt];
        
        for(int i = l ; i <= r ; i++){
            for(int j = 0 ; j < String.valueOf(i).length() ; j++ ){
                str = String.valueOf(i);
                if(str.charAt(j) == '5' || str.charAt(j) == '0'){
                    cnt++;
                }
            }
            if(str.length() == cnt){
                answer[c_cnt++]=i;
            }
            cnt=0;
        }
        int answer1 [] = {-1};
        if(len_cnt == 0){
            return answer1;
        }
        else{
            return answer;
        }
    }
}