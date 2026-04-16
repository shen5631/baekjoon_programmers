class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[]str = new char[my_string.length()];
        for(int i = 0 ; i < str.length ; i++){
            str[i] = my_string.charAt(i);
        }
        for(int i = 0 ; i < str.length ; i++){
            if((int)str[i] <95){
                answer[str[i]-65]++;
            }
            else{
                answer[26+(str[i]-97)]++;
            }
        }
        
        
        return answer;
    }
}