class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        int a,b,c;
        int d = 10000000;
        int a1 = 0;
        for(int i = 0 ; i < answer.length ; i++){
            a=queries[i][0];
            b=queries[i][1];
            c=queries[i][2];
            for(int j = a ; j <= b ; j++){
                if(arr[j]>c && arr[j]<d){
                    d=arr[j];
                    a1++;
                }
            }
            if(a1==0){
                answer[i]=-1;
            }
            else{
                answer[i]=d;                
            }
            a1=0;
            d = 10000000;
        }
        return answer;
    }
}