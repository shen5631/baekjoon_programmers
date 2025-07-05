import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max;

        if(a>b)
            max = a;
        else
            max = b;
        if(max<c)
            max = c;


        if(a==b && b==c){
            System.out.println(10000+a*1000);
        }
        if(a==b && b!=c){
            System.out.println(1000+a*100);
        }
        if(a==c && b!=c){
            System.out.println(1000+a*100);
        }
        if(c==b && b!=a){
            System.out.println(1000+c*100);
        }
        if (a != b && b != c && a!=c) {
            System.out.println(max*100);
        }

    }
}