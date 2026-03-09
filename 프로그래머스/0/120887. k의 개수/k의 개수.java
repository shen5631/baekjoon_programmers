class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int k1 = i ; k1 <= j ; k1++){
            for(int kk = 0 ; kk < String.valueOf(k1).length() ; kk++){
                if((String.valueOf(k1).charAt(kk)+"").equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}