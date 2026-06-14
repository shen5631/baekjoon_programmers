import java.util.*;
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int arr [][] = new int [4][2];
        
        arr[0][0] = h+1;
        arr[0][1] = w;
        
        arr[1][0] = h;
        arr[1][1] = w+1;
        
        arr[2][0] = h-1;
        arr[2][1] = w;
        
        arr[3][0] = h;
        arr[3][1] = w-1;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i][0] < 0 && arr[i][1] < 0){
                arr[i][0]=-1;
                arr[i][1]=-1;
            }
            if(arr[i][0] >= board.length || arr[i][1] >= board.length){
                arr[i][0]=-1;
                arr[i][1]=-1;
            }
        }
        
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        
        String check = board[h][w];
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i][0] > -1 && arr[i][1] > -1){
                if(check.equals(board[arr[i][0]][arr[i][1]])){
                    answer++;
                }
            }
        }
        
        
        
        return answer;
    }
}