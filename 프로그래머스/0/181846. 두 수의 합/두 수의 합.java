import java.math.*;
class Solution {
    public String solution(String a, String b) {
        
        BigInteger a1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        
        String c = String.valueOf(b2.add(a1));
        
        return c;
    }
}