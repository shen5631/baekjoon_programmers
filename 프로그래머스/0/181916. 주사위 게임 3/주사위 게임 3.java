class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int answer = 0;
        
        if(a==b && b == c && c == d){           
            answer=a*1111;
        }
        else if(a == b && b == c && c != d){
            answer =(10*a+d)*(10*a+d);
        }
        else if(a == b && b != c && b == d){
            answer =(10*a+c)*(10*a+c);
        }
        else if(a == c && b != c && c == d){
            answer =(10*a+b)*(10*a+b);
        }
        else if(a != b && b == c && c == d){        
            answer =(10*c+a)*(10*c+a);
        }
        else if(a == b && b != c && c == d){
            if(a>c)
            answer = (a+c)*(a-c); 
            else
            answer = (c+a)*(c-a); 
        }
        else if(a == d && a != c && c == b){
            if(a>c)
                answer = (a+c)*(a-c);
            else
                answer = (c+a)*(c-a);
        }
        else if(a == c && a != b && b == d){  
            if(a>b)
            answer = (a+b)*(a-b);
            else
                answer = (b+a)*(b-a);
        }
        else if(a == b && a != c && a != d){
            answer = c*d;
        }
        else if(a == c && a != d && a != b){
            answer = b*d;
        }
        else if(a == d && a != c && a != b){
            answer = c*b;
        }
        else if(b == c && b != a && b != d){    
            answer = a*d;
        }
        else if(b == d && b != c && b != a){
            answer = a*c;
        }
        else if(c == d && b != c && c != a){
            answer = a*b;
        }
        else if(a < b && a < c && a < d)
            answer = a;
        else if(b < a && b < c && b < d)
            answer = b;
        else if(c < b && c < a && c < d)
            answer = c;
        else if(d < b && d < c && d < a)
            answer = d;
        
        

        return answer;
    }
}