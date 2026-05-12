class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int r = n;
        int l = n-1;
        int d = n-1;
        int u = n-2;
        int cnt = 1;
        // int i = 0;
        
         for(int i = 0 ; i < n/2+1 ; i++){
             for(int j = i ; j < r ; j++){
                 answer[i][j]=cnt++;
             }
             for(int j = i+1 ; j < d ; j++){
                 answer[j][r-1] = cnt++;
             }
             for(int j = l ; j >= i ; j--){
                 answer[d][j] = cnt++;
             }
             for(int j = u ; j >= i+1 ; j--){
                 answer[j][i] = cnt++;
             }
             r--;
             d--;
             l--;
             u--;
         }
        
        

        
        if(n%2==1){
            answer[n/2][n/2] = n*n;
        }
        
        for(int k = 0 ; k < answer.length ; k++){
            for(int j = 0 ; j < answer.length ; j++){
                System.out.print(answer[k][j]+" ");
            }
            System.out.println();
        }        
        return answer;
    }
}