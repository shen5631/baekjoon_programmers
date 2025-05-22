import java.util.Scanner;
class Main{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
        int e = scan.nextInt();
        int b = 1;
        for(int a = e ; a >= 1 ; a--){
            for(int d = 1 ; d < a ; d++)
            System.out.print(" ");

                for(int c = 1 ; c <= b ; c++){
                    System.out.print("*");
                }
                System.out.println();
                b++;
        }
    }
}