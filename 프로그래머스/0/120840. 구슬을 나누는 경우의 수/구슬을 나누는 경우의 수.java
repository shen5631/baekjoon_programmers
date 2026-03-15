import java.math.*;
class Solution {
    public long solution(int balls, int share) {
        long answer = 0;
        BigInteger n= BigInteger.ONE;
        BigInteger m= BigInteger.ONE;
        BigInteger n_m= BigInteger.ONE;

    
        for(int i = 1 ; i <= balls ; i++){
            n = n.multiply(BigInteger.valueOf(i));
        }
        
        for(int i = 1 ; i <= share ; i++){
            m = m.multiply(BigInteger.valueOf(i));
        }
        for(int i = 1 ; i <= balls - share ; i++){
            n_m = n_m.multiply(BigInteger.valueOf(i));
        }
        answer = n.divide(n_m.multiply(m)).longValue();

        return answer;
    }
}