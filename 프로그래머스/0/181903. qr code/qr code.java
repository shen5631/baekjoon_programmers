class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int a [] = new int [code.length()];
        String code1 [] =new String [code.length()];
        for(int i = 0 ; i < code.length() ; i++){
            code1[i] = code.charAt(i)+"";
        }
        for(int i = 0 ; i < code.length() ; i++){
            a[i]=i%q;
        }
        for(int i = 0 ; i < code.length() ; i++){
            if(a[i]==r){
                answer+=code1[i];
            }
        }
        return answer;
    }
}