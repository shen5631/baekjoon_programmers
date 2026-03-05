class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int a,b;
        
        for(int i = 0 ; i < queries.length ; i++){
            a = arr[queries[i][0]];
            b = arr[queries[i][1]];
            
            arr[queries[i][0]]=b;
            arr[queries[i][1]]=a;
        }
        for(int i = 0  ; i < answer.length ; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}