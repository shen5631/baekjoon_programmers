import java.util.Scanner;
class Main{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        int a [] = new int[6];

        for(int i = 0 ; i < 6 ; i++){
            a[i]= scan.nextInt();
        }

        int b = 1-a[0];
        System.out.print(b+" ");
        b = 1-a[1];
        System.out.print(b+" ");
        b = 2-a[2];
        System.out.print(b+" ");
        b = 2-a[3];
        System.out.print(b+" ");
        b = 2-a[4];
        System.out.print(b+" ");
        b = 8-a[5];
        System.out.print(b+" ");

    }
}