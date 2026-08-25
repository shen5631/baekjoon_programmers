class Solution {
    public String solution(String myString, String pat) {
        int index = 0;
        String answer="";
        int cnt = 0;
        for(int i = 0 ; i <= myString.length() - pat.length() ; i++){
            for(int j = 0 ; j < pat.length() ; j++){
                if(myString.charAt(i+j) == pat.charAt(j)){
                    cnt++;
                }
        
                if(cnt == pat.length()){
                index=i+j;
                }
            }

            cnt=0;
        }
        
        
        for(int i = 0 ; i <= index ; i ++){
            answer += myString.charAt(i)+"";
        }
        System.out.println(index);
        return answer;
    }
}