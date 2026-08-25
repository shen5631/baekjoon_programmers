class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int num = 0;
        for(int i = 0 ; i < numbers.length ; i++ ){
            num = numbers[i];
            answer[i]=num*2;
             
        }
        return answer;
    }
}