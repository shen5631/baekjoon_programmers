class Solution {
    public String solution(String my_string) {
        String answer = "";
        int j = my_string.length()-1;
        String a [] = new String [my_string.length()];
        String b [] = new String [my_string.length()];
        for(int i = 0; i < my_string.length() ; i++){
            a[i]=my_string.charAt(i)+"";
        }
        for(int i = 0; i < my_string.length() ; i++){
            b[j--]=a[i];            
        }
        for(int i = 0 ; i < my_string.length(); i++){
            answer+=b[i];
        }
        return answer;
    }
}