class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int [][] a = new int[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board.length>2){
                if(j!=0 && j!= board.length-1 && i!=0 && i!= board.length-1 ){
                    if(board[i][j]==1){
                        a[i+1][j]=1;
                        a[i-1][j]=1;
                        a[i][j-1]=1;
                        a[i][j+1]=1;
                        a[i+1][j+1]=1;
                        a[i+1][j-1]=1;
                        a[i-1][j+1]=1;
                        a[i-1][j-1]=1;
                    }
                }
                else if(i==0 && j==0 && board[i][j]==1){
                    a[i+1][j]=1;
                    a[i][j+1]=1;
                    a[i+1][j+1]=1;
                }
                else if(i==0 && j==board.length-1 && board[i][j]==1){
                    a[i+1][j]=1;
                    a[i][j-1]=1;
                    a[i+1][j-1]=1;
                }
                else if(i==board.length-1 && j==0 && board[i][j]==1){
                    a[i-1][j]=1;
                    a[i][j+1]=1;
                    a[i-1][j+1]=1;
                }
                else if(i==board.length-1 && j==board.length-1 && board[i][j]==1){
                    a[i-1][j]=1;
                    a[i][j-1]=1;
                    a[i-1][j-1]=1;
                }
                else if(j==0 && board[i][j]==1){
                    a[i-1][j]=1;
                    a[i+1][j]=1;
                    a[i][j+1]=1;
                    a[i-1][j+1]=1;
                    a[i+1][j+1]=1;
                }
                else if(i==0 && board[i][j]==1){
                    a[i+1][j]=1;
                    a[i][j-1]=1;
                    a[i][j+1]=1;
                    a[i+1][j-1]=1;
                    a[i+1][j+1]=1;
                }
                else if(j==board.length-1 && board[i][j]==1){
                    a[i-1][j]=1;
                    a[i+1][j]=1;
                    a[i][j-1]=1;
                    a[i-1][j-1]=1;
                    a[i+1][j-1]=1;
                }
                else if(i==board.length-1 && board[i][j]==1){
                    a[i-1][j]=1;
                    a[i][j-1]=1;
                    a[i][j+1]=1;
                    a[i-1][j-1]=1;
                    a[i-1][j+1]=1;
                }
                }
                else if(board.length==2 && board[i][j]==1){
                    a[0][0]=1;
                    a[0][1]=1;
                    a[1][0]=1;
                    a[1][1]=1;
                }

            }
        }
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(a[i][j]+board[i][j]==0)
                    answer++;
            }
        }


        
        
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return answer;
    }
}