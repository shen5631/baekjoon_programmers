class Solution {
    public String[] solution(String my_str, int n) {
        int a = my_str.length()/n;
        int c = 0;
        int d = -1;
        if(my_str.length()-a*n>0){
            a++;
            c=my_str.length()-a*n;
        }
        String[] answer = new String [a];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i]="";
        }
        for(int i = 0 ; i < my_str.length() ; i++){
            if(i%n==0){
                d++;
            }
            answer[d]+=my_str.charAt(i)+"";
        }
        return answer;
    }
}