class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int sum = 0 ;
        for(int i = num1 ; i <= num2 ; i++){
            sum++;
        }
        int a = 0 ;
        int[] answer = new int[sum];
        
        for(int i = num1 ; i <= num2 ; i++){
            answer[a]=numbers[i];
            a++;
        }
        
       return answer;
    }
}