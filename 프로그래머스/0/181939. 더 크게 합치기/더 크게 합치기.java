class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        
        if(a/1000!=0){      //a 판별 1000자리 판별
            c=a/1000;       //앞자리만 남기고 날리기
        }
        else if(a/100!=0){  //100자리 판별
            c=a/100;        //앞자리만 남기고 날리기
        }
        else if(a/10!=0){   //10자리 판별
            c=a/10;         //앞자리만 남기고 날리기
        }
        else{               //1자리 판별
            c=a;            //앞자리만 남기고 날리기
        }
        
        
        if(b/1000!=0){      //b판별
            d=b/1000;       
        }
        else if(b/100!=0){
            d=b/100;
        }
        else if(b/10!=0){
            d=b/10;
        }
        else{
            d=b;
        }
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