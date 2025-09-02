class Solution {
    public String solution(String s) {
        String answer = "";
        char temp = ' ';
        char a [] = new char [s.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=s.charAt(i);
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            answer+=a[i];
        }
        return answer;
    }
}