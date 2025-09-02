class Solution {
    public String solution(String s) {
        String answer = "";
        String a [] = new String [s.length()];
        int b = 0;
        String c [] = new String [s.length()];
        for(int i = 0 ;i < a.length ; i++){
            a[i]=s.charAt(i)+"";
        }
        int d = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            
            if(a[i].equals(" ")){
                b=-1;
            }
            if(b%2==0){
                c[d++]=a[i].toUpperCase();
            }
            else{
                c[d++]=a[i].toLowerCase();
            }
            ++b;
        }
        for(int i = 0 ;i < a.length ; i++){
            answer+=c[i];
        }
        return answer;
    }
}