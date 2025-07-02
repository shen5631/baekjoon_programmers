class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String a [] = new String[cipher.length()];
        int b = 0;
        for(int i = 0 ; i < a.length ; i++){
            a[i]=cipher.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length/code ; i++){
            b+=code;
            answer+=a[b-1];
        }
        
        return answer;
    }
}