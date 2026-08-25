class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        String an ="";
        String a [] = new String [bin1.length()];
        String b [] = new String [bin2.length()];
        int a1 = 1;
        int b1 = 1;
        int cnt=0;
        
        for(int i = 0 ; i < a.length ; i++){
            a[i] = bin1.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            b[i] = bin2.charAt(i)+"";
        }
        for(int i = 1 ; i < a.length ; i++){
            if(a[i].equals("0"))
                a1*=2;
            else{
                a1*=2;
                a1+=1;
            }         
        }
        for(int i = 1 ; i < b.length ; i++){
            if(b[i].equals("0"))
                b1*=2;
            else{
                b1*=2;
                b1+=1;
            }         
        }
        a1=a1+b1;
        int a3=a1;
        for(;a3>1;){
          a3/=2;
            cnt++;
        }
        String a2 [] = new String [cnt];
        for(int i =0;a1>1;i++){
           if(a1%2==0){
               a1/=2;
               an+="0";
           }
            else{
                a1/=2;
                an+="1";
            } 
        }
        if(!(bin1.equals("0") && bin1.equals("0")))
        answer+="1";
        for(int i = 0 ; i < an.length() ;i++){
            a2[i]=an.charAt(i)+"";
        }
        for(int i = cnt-1 ; i >= 0 ;i--){
            answer+=a2[i];
        }
        return answer;
    }
}