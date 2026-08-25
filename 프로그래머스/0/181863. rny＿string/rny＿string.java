class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String a [] = new String [rny_string.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=rny_string.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals("m"))
                answer+="rn";
            else
                answer+=a[i];
        }
        return answer;
    }
}