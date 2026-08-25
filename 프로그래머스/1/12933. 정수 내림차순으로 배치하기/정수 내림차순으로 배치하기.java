class Solution {
    public long solution(long n) {
        String answer = "";
        int temp = 0;
        String a1 = String.valueOf(n);
        String c = String.valueOf(n);
        String a [] = new String [a1.length()];
        int b [] = new int [a1.length()];
        
        for(int i = 0 ; i < a.length ; i++){
            a[i]=c.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
            b[i]=Integer.parseInt(a[i]);
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i + 1 ; j < a.length ; j++){
                if(b[i]<b[j]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            answer+=b[i];
        }
        
        
        return Long.valueOf(answer);
    }
}