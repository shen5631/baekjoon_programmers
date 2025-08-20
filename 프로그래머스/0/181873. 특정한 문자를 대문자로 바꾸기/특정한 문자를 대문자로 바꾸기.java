class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String a [] = new String [my_string.length()];
        
        for(int i = 0 ; i < a.length ; i++){
            a [i] = my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals(alp))
                a[i] = a[i].toUpperCase();
        }
        for(int i = 0 ; i < a.length ; i++){
            answer+=a[i];
        }
        return answer;
    }
}