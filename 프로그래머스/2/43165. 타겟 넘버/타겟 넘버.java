public class Solution {
    static int answer=0;
    public static void math(int i,int len,int arr [],int [] numbers,int target){
        int sum=0;
        if(i >= len){
            for(int j = 0 ; j < arr.length;j++){
                if(arr[j] == 1){
                    sum+=numbers[j];
                }
                else{
                    sum-=numbers[j];
                }
            }
            if(sum == target){
                answer++;
                
            }
            return;
        }
        arr[i]=0;
        math(i+1,len,arr,numbers,target);
        arr[i]=1;
        math(i+1,len,arr,numbers,target);
    }

    public int solution(int[] numbers, int target) {

        int arr [] = new int[numbers.length];

        math(0,numbers.length,arr,numbers,target);


        return answer;
    }
}