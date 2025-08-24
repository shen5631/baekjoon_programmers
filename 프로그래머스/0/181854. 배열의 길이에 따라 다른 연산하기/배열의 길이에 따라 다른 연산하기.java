class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int [arr.length];
        int cnt = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            answer[i]=arr[i];
        }
        if(arr.length % 2 == 0){
            cnt=1;
        }
        if(cnt == 0){
            for(int i = 0 ; i < arr.length ; i++){
                if(i%2==0)
                answer[i]=arr[i]+n;
            }
        }
        else{
            for(int i = 0 ; i < arr.length ; i++){
                if(i%2==1)
                answer[i]=arr[i]+n;
            }
        }
        
        return answer;
    }
}