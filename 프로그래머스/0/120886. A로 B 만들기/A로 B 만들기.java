class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int cnt=0;
        String a [] = new String[before.length()];
        String b [] = new String[after.length()];
        for(int i = 0 ; i < before.length() ; i++){
            a[i]=before.charAt(i)+"";
        }
        for(int i = 0 ; i < before.length() ; i++){
            b[i]=after.charAt(i)+"";
        }
        for(int i = 0 ; i < before.length() ; i++){
            for(int j = 0 ; j < a.length ; j++){
                if(a[i].equals(b[j])){
                    b[j]=" ";
                    cnt++;
                    break;
                }  
            }
        }

        if(cnt==a.length)
            answer=1;
        else
            answer=0;
        return answer;
    }
}