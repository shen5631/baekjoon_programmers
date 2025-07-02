class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String a [] = new String [my_string.length()];
        String b ;
        for(int i = 0 ; i < my_string.length() ; i++){
            a[i]=my_string.charAt(i)+"";
        }
        b=a[num1];
        a[num1]=a[num2];
        a[num2]=b;
        for(int i = 0 ; i < a.length ; i++){
            answer+=a[i];
        }
        return answer;
    }
}