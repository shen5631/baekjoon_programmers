class Solution {
    public String solution(String myString) {
        String answer = "";
        char b = 'l';
        char a [] = new char[myString.length()];
        for(int i = 0 ; i < myString.length();i++){
            a[i]=myString.charAt(i);
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]<b)
                answer+="l";
            else
                answer+=a[i]+"";
        }
        return answer;
    }
}