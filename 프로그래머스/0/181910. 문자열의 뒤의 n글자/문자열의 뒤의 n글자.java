class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String a [] = new String [n];
        int b = 0;
        int su = my_string.length()-n;
        
        for(int i = su ; i < my_string.length(); i++){
            a[b++]=my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            answer+=a[i];
        }
        
        return answer;
    }
}