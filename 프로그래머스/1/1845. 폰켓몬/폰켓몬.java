class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i]!=nums[i+1]){
                answer++;
            }
        }
        if(answer>nums.length/2){
            answer=nums.length/2;
        }
        
        return answer;
    }
}