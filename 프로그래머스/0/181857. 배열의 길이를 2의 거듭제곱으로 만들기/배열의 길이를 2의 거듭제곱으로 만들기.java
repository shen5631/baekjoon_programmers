class Solution {
    public int[] solution(int[] arr) {
        int a = 1;
        while(a< arr.length){

            a = a*2;

        }

        int[] answer = new int[a];
        for(int i = 0 ; i < arr.length ; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}