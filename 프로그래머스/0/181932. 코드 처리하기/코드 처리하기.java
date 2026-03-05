class Solution {
    public String solution(String code) {
        String answer = "";
        String a [] = new String [code.length()];
        boolean b = false;
        
        for(int i = 0 ; i < a.length ; i++){
            a[i]=code.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals("1")){
                b=!b;
            }
            if( b == false && i % 2 == 0 && !(a[i].equals("1"))){
                answer+=a[i];
            }
            if(b && i % 2 == 1 && !(a[i].equals("1"))){
                answer+=a[i];
            }
        }
        if(answer.equals("")){
            answer="EMPTY";
        }
        return answer;
    }
}