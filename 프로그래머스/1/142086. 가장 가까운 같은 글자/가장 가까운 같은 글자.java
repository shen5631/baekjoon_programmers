class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        
        int uni [] = new int [26];
        
        for(int i = 0 ; i < uni.length ; i++){
            uni[i] = -1;
        }
        
        for(int i = 0 ; i < s.length() ; i++){
            if(uni[s.charAt(i)-97] == -1){
                answer[i] = uni[s.charAt(i)-97];
            }
            else{
                answer[i] = i - uni[s.charAt(i)-97];
            }
            uni[s.charAt(i)-97] = i;
            
        }
        return answer;
    }
}