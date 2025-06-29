class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String a [] = new String[my_string.length()];
        for(int i = 0 ; i < my_string.length();i++){
            a[i]=my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < my_string.length() ; i++){
            if(!(a[i].equals(letter)))
                answer+=a[i];
        }
        return answer;
    }
}

