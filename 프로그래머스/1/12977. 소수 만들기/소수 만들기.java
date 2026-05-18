class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt =0;
        int sum = 0;
        
        for(int i = 0;   i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    sum=nums[i]+nums[j]+nums[k];
                    for(int h = 2 ; h < sum ; h++){
                        if(sum%h == 0){
                            cnt++;
                        }
                    }
                    if(cnt == 0){
                        answer++;
                    }
                    cnt=0;
                }
            }
        }

        return answer;
    }
}