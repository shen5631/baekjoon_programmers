class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(sum<array[i]){
                answer[0]=array[i];
                answer[1]=i;
                sum=array[i];
            }
        }
        return answer;
    }
}