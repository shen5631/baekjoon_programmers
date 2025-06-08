class Solution {
    public int solution(int[] numbers, int k) {
        int a = 0;
        int answer = 0;
        for(int i = 1 ; i <= k ; i++){
            if(a>numbers.length-1)
                a=a-numbers.length;
            answer=numbers[a];
            a+=2;
        }
        return answer;
    }
}