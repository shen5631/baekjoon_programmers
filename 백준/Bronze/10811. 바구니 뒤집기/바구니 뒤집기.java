import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c []= new int[a];
        int d,e;
        int f[] = new int [a];
        int g;

        for(int i = 1 ; i <= a ; i++) {
            c[i - 1] = i;
            f[i-1]=i;
        }

        for(int i = 0 ; i <  b ; i++) {
            d = scan.nextInt();
            e = scan.nextInt();


            for(int n = 0 ; n < a ; n++)
                f[n]=c[n];
            g=e;
            for (int j = d; j <= e; j++) {
                c[j-1]=f[g-1];
                g--;
            }
        }



        for(int i = 0 ; i < a ; i++)
            System.out.print(c[i]+" ");
    }
}
