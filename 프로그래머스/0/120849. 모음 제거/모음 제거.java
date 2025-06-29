class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] a = new String [my_string.length()];
        int j = 0;
        for(int i = 0 ; i < my_string.length() ; i++){
            if(my_string.charAt(i)!='a' && 
               my_string.charAt(i)!='u' && 
               my_string.charAt(i)!='i' && 
               my_string.charAt(i)!='o' && 
               my_string.charAt(i)!='e')
                answer+=my_string.charAt(i);
        }
        return answer;
    }
}