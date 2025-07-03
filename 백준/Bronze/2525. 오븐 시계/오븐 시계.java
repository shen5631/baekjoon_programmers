import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = scan.nextInt();
        int d = b+c;
        int e = d/60;
        int f = (a+e)%24;
        System.out.println(f+" "+(d-60*e));
    }
}