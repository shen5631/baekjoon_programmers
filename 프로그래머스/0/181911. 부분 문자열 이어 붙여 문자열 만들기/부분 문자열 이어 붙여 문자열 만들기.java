class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0 ; i < parts.length ; i++){
            for(int k = parts[i][0] ; k <= parts[i][1] ; k++){
                answer+=my_strings[i].charAt(k)+"";
            }
        }
        return answer;
    }
}