import java.util.Scanner;
class Main
{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);

        int a = scan.nextInt();
        int b;
        int c [] = new int [a];
        int su = 0 ;
        double cnt = 0;
        for(int i = 0 ; i < a ; i++){
            b = scan.nextInt();
            c[i] = b;
            if(c[i]>su){
                su = c[i];
            }

        }
        for(int i = 0 ; i < a ; i++) {
            cnt+=(((double) c[i] / su * 100));
        }
        System.out.println(cnt/a);
    }
}