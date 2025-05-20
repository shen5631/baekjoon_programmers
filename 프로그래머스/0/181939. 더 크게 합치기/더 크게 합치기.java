class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int e=0;
        int f=0;
        
        
            if(b/1000!=0){
               e = a*10000+b;
            }
            else if(b/100!=0){
               e = a*1000+b;
            }
            else if(b/10!=0){
               e = a*100+b;
            }
            else{
               e = a*10+b;
            }               

            if(a/1000!=0){
               f = b*10000+a;
            }
            else if(a/100!=0){
               f = b*1000+a;
            }
            else if(a/10!=0){
               f = b*100+a;
            }
            else {
               f = b*10+a;
            }

        if(e>f){
        answer=e;
        }
        else{
        answer=f;
        }
        return answer;
    }
}