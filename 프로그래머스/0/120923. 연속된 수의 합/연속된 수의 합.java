class Solution {
    public int[] solution(int num, int total) {
        int sum = 0;
        int a = 0;
        int answer [] = new int [num];
        for(int i = -100 ;i  <= 500 ; i++ ){
            for(int j = i ; j < i+num ; j++){
                sum+=j; 
                answer[a++] = j;
            }
            if(sum == total){
                System.out.println(sum);
                break;
            }
            sum=0;
            a=0;
        }
        return answer;
    }
}
