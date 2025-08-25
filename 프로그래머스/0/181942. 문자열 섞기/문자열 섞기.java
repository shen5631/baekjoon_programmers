class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < str1.length()+str2.length() ; i++){
            if(i%2==0)
                answer+=str1.charAt(a++);
            else
                answer+=str2.charAt(b++);
        }
        return answer;
    }
}