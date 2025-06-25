class Solution {
    public long[] solution(long n) {
        long b = -1L;         //숫자 판별
        int i = 1;          // 자리수

        long d = 1L;          //수 계산1
        long e;              //수계산 2
        long f = n ;         //수계산3

        for(;;i++){
            if(n+b<0)
                break;
            else
                b*=10;
        }
        i--;

        long a1=1L;
        for(int k = 1; k < i ; k++)
            a1*=10;

       long c [] = new long[i];
        long c1 []= new long[i];
        int c2=i-1;

        for(int j = 0 ; j < i ; j++){
            e=f;
            d=e/a1;
            c[j]=d;
            f=e-d*a1;
            a1/=10;
        }
        for(int j = 0 ; j < c.length ; j++){
            c1[c2]=c[j];
            c2--;
        }
        
        return c1;
}
}
