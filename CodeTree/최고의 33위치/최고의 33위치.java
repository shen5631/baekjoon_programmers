import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int temp = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0 ; k < 3 ; k++){
                    for(int h = 0 ; h < 3 ; h++){
                        if(i + k < grid.length && j + h < grid.length){
                            if(grid[i+k][j+h] == 1){
                                temp++;
                            }
                        }
                    }
                }
                if(temp > max) max = temp;
                temp=0;
            }
        }
        System.out.println(max);
    }
}