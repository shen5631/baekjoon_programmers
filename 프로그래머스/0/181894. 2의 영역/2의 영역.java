class Solution {
    public int[] solution(int[] arr) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==2){
                a=i;
                break;
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==2){
                b=i;
                d++;
            }
        }
        int[] answer = new int [b-a+1];

     
        for(int i  = a ; i <= b ; i++){
            answer[c++] = arr[i];
        }
        if(d==0){
            answer[0]=-1;
        }
        return answer;
    }
}