import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int a2 = scan.nextInt();

        int a [][]=new int [a1][a2];
        int b [][]=new int [a1][a2];

        for(int i = 0 ; i < a1 ; i++){
            for(int j = 0 ; j < a2 ; j++){
                a[i][j]= scan.nextInt();
            }
        }
        for(int i = 0 ; i < a1 ; i++){
            for(int j = 0 ; j < a2 ; j++){
                b[i][j]= scan.nextInt();
            }
        }
        for(int i = 0 ; i < a1 ; i++){
            for(int j = 0 ; j < a2 ; j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }

    }
}