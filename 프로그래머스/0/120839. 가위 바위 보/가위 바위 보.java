class Solution {
    public String solution(String rsp) {
        String answer = "";
        String a [] = new String[rsp.length()];
        for(int i = 0 ; i < rsp.length() ; i++){
            a[i]=rsp.charAt(i)+"";
        }
        for(int i = 0 ; i < rsp.length() ; i++){
            if(a[i].equals("2"))
                answer+="0";
            if(a[i].equals("0"))
                answer+="5";
            if(a[i].equals("5"))
                answer+="2";
        }
        return answer;
    }
}