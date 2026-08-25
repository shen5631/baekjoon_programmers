class Solution {
    public String solution(String my_string) {
        String answer = "";
        char a [] = new char[my_string.length()];
        String b [] = new String[my_string.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=my_string.charAt(i);
            b[i]=my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            if((int)a[i] <= 90)
               b[i]=b[i].toLowerCase();
            else
                b[i]=b[i].toUpperCase();
        }
        for(int i = 0 ; i < a.length ; i++)
            answer+=b[i];
        return answer;
    }
}