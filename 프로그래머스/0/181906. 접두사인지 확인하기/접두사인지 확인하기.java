class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String a [] = new String [my_string.length()];
        String b [] = new String [is_prefix.length()];
        int cnt = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            a[i]=my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            b[i]=is_prefix.charAt(i)+"";
        }
        if(my_string.length()>=is_prefix.length())
        for(int i = 0 ; i < b.length ; i++){
            if(a[i].equals(b[i]))
                cnt++;
        }
        if(cnt==b.length)
            answer=1;
        return answer;
    }
}