class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        String b [] = new String[a.length()];
        for(int i = 0 ; i < a.length() ; i++){
            b[i]=a.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            answer+=Integer.parseInt(b[i]);
        }
        return answer;
    }
}