class Solution {
    public int solution(String number) {
        int answer = 0;
        String a [] = new String [number.length()];
            for(int i = 0 ; i < a.length ; i++){
                a[i]=number.charAt(i)+"";
            }
        for(int i = 0 ; i < number.length();i++){
            answer+=Integer.parseInt(a[i]);
        }
        return answer%9;
    }
}