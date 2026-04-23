class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0 ; i <= myString.length() - pat.length() ; i++){
            for(int j = 0 ; j < pat.length() ; j++){
                if(myString.charAt(i+j) == pat.charAt(j)){
                    System.out.println(myString.charAt(i+j));
                    cnt++;
                }
            }
            System.out.println(cnt);
            if(cnt == pat.length()){
                answer++;
            }
            cnt=0;
        }
        return answer;
    }
}