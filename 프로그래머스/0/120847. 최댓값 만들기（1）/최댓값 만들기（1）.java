class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = 0 ; j < numbers.length ; j++){
                if(i != j){
                     if(sum < numbers[i]*numbers[j])
                        sum = numbers[i]*numbers[j];
                }
            }
        }
            
        return sum;
    }
}
