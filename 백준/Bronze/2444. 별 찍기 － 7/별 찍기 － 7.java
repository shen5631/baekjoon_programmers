import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();

        int a = 1;
        int b = a1-1;
        int c = 1;
        int d = a1+2;

            for (int i = 1; i <= a1; i++) {
                for(int k =1;k<=b;k++)
                    System.out.print(" ");
                for (int j = 1; j <= a; j++) {
                    System.out.print("*");
                }
                b--;
                a += 2;
                System.out.println();
            }
            a-=4;
            for(int i = 1 ; i <= a1-1 ; i++){
                for(int j = 1 ; j <= c ; j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= a ; k++){
                    System.out.print("*");
                }
                c++;
                a-=2;
                System.out.println();
            }
        }
    }
