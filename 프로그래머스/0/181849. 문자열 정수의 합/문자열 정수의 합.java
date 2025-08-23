class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String a [] = new String [num_str.length()];
        for(int i = 0 ; i < num_str.length() ; i++){
            a[i]=num_str.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            answer+=Integer.parseInt(a[i]);
        }
        return answer;
    }
}