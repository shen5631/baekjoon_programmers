class Solution {
    public String[] solution(String my_string) {
        int cnt = 1;
        String a [] = new String [my_string.length()];
        for(int i = 0 ; i < my_string.length() ; i++){
            a[i] = my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals(" "))
                cnt++;
        }
        String[] answer = new String[cnt];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i]="";
        }
        int a1 = 0;
        for(int i = 0 ; i < a.length ; i++){
            if((a[i].equals(" "))){
                a1++;
            }
            else{
                answer[a1]+=a[i];
            }
        }
        return answer;
    }
}