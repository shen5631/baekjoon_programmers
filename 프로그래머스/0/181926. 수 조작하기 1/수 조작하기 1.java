class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String a [] = new String [control.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=control.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            switch(a[i]){
                case "w" : answer+=1; break;
                case "s" : answer-=1; break;
                case "d" : answer+=10; break;
                case "a" : answer-=10; break;
            }
        }
        return answer;
    }
}