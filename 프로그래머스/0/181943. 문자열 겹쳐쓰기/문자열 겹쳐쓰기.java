class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a[] = new String [my_string.length()];
        String b[] = new String [overwrite_string.length()];
        int a1 = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            a[i]=my_string.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            b[i]=overwrite_string.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ;i++){
            if(i >= s && i < b.length+s)
                answer+=b[a1++];
            else
                answer+=a[i];
        }
        
        return answer;
    }
}