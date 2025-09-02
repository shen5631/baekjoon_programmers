class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        String a [] = new String [s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            a[i]=s.charAt(i)+"";
        }
        for(int i = 0 ; i < s.length() ; i++){
            switch(a[i]){
                case "0","1","2","3","4","5","6","7","8","9" : cnt++;break;
            }
        }     
        if(cnt!=a.length){
            answer=false;
        }
        if(a.length!=4 && a.length!=6){
            answer=false;
        }
        return answer;
    }
}