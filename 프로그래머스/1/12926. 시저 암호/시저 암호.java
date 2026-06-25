class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        String str = s.toUpperCase();
        String new_str = "";
        
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            for(int j = 0 ; j < n ; j++){
                if(ch != 32){
                    ch++;
                }
                if(ch>90){
                    ch='A';
                }
            }
            new_str+=ch+"";
            System.out.println(ch);
        }
        
        
        for(int i = 0 ; i < str.length() ; i++){
            char ch = s.charAt(i);
            char ch2 = new_str.charAt(i);
            if(ch > 90){
                answer +=(ch2+"").toLowerCase();
            }
            else{
                answer +=(ch2+"");
            }
        }
        
        return answer;
    }
}