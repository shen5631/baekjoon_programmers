class Solution {
    public String solution(String n_str) {
        String answer = "";
        String a [] = new String [n_str.length()];
        int b=0;
        
        for(int i = 0 ; i < a.length ; i ++){
            a[i]=n_str.charAt(i)+"";
        }
        
        for(int i = 0 ; i < a.length ; i++){
            if(!(a[i].equals("0"))){
                b=i;
                break;
            }
        }
        for(int i = b ; i < n_str.length() ; i++){
            answer+=n_str.charAt(i);
        }
        return answer;
    }
}