class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String b = s.toLowerCase();
        int c [] = new int [2];

        String a [] = new String [s.length()];
        
        for(int i = 0 ; i < s.length() ; i++){
            a[i]=b.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals("p"))
                c[0]++;
            else if(a[i].equals("y"))
                c[1]++;
        }
        if(c[0]!=c[1])
            answer=false;

        return answer;
    }
}