class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int cnt=0;
        String a = String.valueOf(num);
        String n = String.valueOf(k);
        String b [] = new String[a.length()];
        for(int i  = 0 ; i < a.length() ; i++){
            b[i]=a.charAt(i)+"";
        }
        for(int i = 0 ;i < b.length ; i++){
            if(b[i].equals(n)){
                answer=i+1;
                break;
            }
            else
                cnt++;
        }
        if(cnt==b.length)
            answer=-1;
        return answer;
    }
}