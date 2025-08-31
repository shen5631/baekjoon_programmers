class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long cnt  = 0;
        for(int i = 1 ; i <= count ; i++){
            cnt+=i*price;
        }
        if(money-cnt< 0){
            answer=cnt-money;
        }
        return answer;
    }
}