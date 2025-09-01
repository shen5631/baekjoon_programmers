class Solution {
    public String solution(String s) {
        String answer = "";
        String a [] = new String [s.length()];
        
        for(int i = 0 ; i < a .length ; i ++){
            a[i]=s.charAt(i)+"";
        }
        
        if(a.length % 2 ==0){
             answer+=a[a.length/2-1];
            answer+=a[a.length/2];
           
        }
        else
            answer+=a[a.length/2];
        return answer;
    }
}