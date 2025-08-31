class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String a = String.valueOf(x);
        String b [] = new String [a.length()];
        int c = 0;
        
        for(int i = 0 ; i < b.length ; i++){
            b[i]=a.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            c+=Integer.parseInt(b[i]);
        }
        if(x%c==0)
            answer=true;
        return answer;
    }
}