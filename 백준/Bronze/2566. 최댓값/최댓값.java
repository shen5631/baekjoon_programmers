import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a [][] = new int[9][9];

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                a[i][j]=scan.nextInt();
            }
        }
        int max = a[0][0];
        int b = 0;
        int c = 0;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(max<a[i][j]){
                    max=a[i][j];
                    b=i;
                    c=j;
                }
            }
        }
        System.out.println(max);
        System.out.println(b+1+" "+(c+1));
    }
}