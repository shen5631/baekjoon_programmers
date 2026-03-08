class Solution {
    public int[] solution(String myString) {
        int cnt = 1;
        
        
        for(int i = 0 ; i < myString.length() ; i++){
            if((myString.charAt(i)+"").equals("x")){
                cnt++;
            }
        }
        
        
        int[] answer = new int [cnt];
        
        int a = 0 ;
        int cnt1 = 0;
        for(int i = 0 ; i < myString.length() ; i++){
            if((myString.charAt(i)+"").equals("x")){
                answer[a++] = cnt1;
                cnt1=0;
            }
            else{
                cnt1++;
            }
        }
        answer[cnt-1]=cnt1;
        return answer;
    }
}