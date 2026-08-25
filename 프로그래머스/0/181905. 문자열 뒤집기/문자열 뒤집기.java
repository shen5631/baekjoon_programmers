class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a [] = new String [e-s+1];
        int b = a.length-1;
        String c="";
        String d="";
        for(int i = s ; i <= e ; i++){
            a[b--]=my_string.charAt(i)+"";
        }
        for(int i = e+1 ; i < my_string.length(); i++){
            c+=my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < s ; i++){
            d+=my_string.charAt(i)+"";
        }
        answer+=d;
        for(int i = 0 ; i < a.length ; i++){
            answer+=a[i];
        }
        answer+=c;
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]);
        }
        return answer;
    }
}