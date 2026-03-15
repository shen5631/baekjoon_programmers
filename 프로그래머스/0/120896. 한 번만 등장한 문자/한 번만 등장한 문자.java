class Solution {
    public String solution(String s) {
        String answer = "";
        int b = 10000;
        char a [] =new char [s.length()];
        int abc [] =new int [26];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=s.charAt(i);
        }
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < 26 ; j++ ){
                if(((char)(97+j)) == a[i]){
                    abc[j]++;
                }
            }
        }
        
        for(int i = 0 ; i < abc.length ; i++){
            if(abc[i] == 1){
                answer+=((char)(97+i))+"";
            }
        }
        
        return answer;
    }
}