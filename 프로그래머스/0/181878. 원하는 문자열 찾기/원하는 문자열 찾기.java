class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String a = myString.toLowerCase();
        String b = pat.toLowerCase();  
        
        int num = a.indexOf(b);
        if(num == -1){
            answer=0;
        }
        else{
            answer=1;
        }
        
        
        return answer;
    }
}