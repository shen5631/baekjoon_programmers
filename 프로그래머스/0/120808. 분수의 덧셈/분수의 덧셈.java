class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        int denom3 = 0;
        int numer3 = 0;
        
        if(denom1 == denom2){
            numer3 = numer1 + numer2;
            denom3 = denom1;
        }
        else{
            numer3 = numer1 * denom2 + numer2 * denom1;
            denom3 = denom1 * denom2;
        }

        int up;
        
        if(denom3 > numer3){
            up = denom3;
        }
        else{
            up = numer3;
        }
        
        for(int i = up ; i >= 2 ; i--){
            if(denom3 % i == 0 && numer3 % i == 0){
                denom3 /=i;
                numer3 /= i;
                System.out.println(1);
            }
        }
        
                
        answer[0] = numer3;
        answer[1] = denom3;
        
        
        return answer;
    }
}