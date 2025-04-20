import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = b%100%10;
        int d = b%100-c;
        int e = b-d-c;
        System.out.println(a*c);
        System.out.println(a*d/10);
        System.out.println(a*e/100);
        System.out.println(a*b);
    }
}