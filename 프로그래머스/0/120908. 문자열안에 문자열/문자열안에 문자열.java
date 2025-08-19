class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int a;
        int cnt;
        
        String str11 [] = new String [str1.length()];
        String str22 [] = new String [str2.length()];
        
        for(int i = 0 ; i < str11.length ; i++){
            str11[i]=str1.charAt(i)+"";
        }
        for(int i = 0 ; i < str22.length ; i++){
            str22[i]=str2.charAt(i)+"";
        }
        if(str11.length == str22.length){
            if(str1.equals(str2))
                answer=1;
        }
        else if(str11.length<str22.length){
            answer=2;
        }
        else{
            for(int i = 0 ; i <= str11.length-str22.length ; i++){
                 a = 0;
                 cnt = 0;
                for(int j = i ; j < i+str22.length ; j++){
                    if(str11[j].equals(str22[a++])){
                        cnt++;
                    }
                }
                if(cnt==str22.length){
                    answer = 1 ;
                    break;
                }
            }
        }

        return answer;
    }
}