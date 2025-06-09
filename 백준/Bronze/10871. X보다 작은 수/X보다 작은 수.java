import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c [] = new int [a];
        int d ;
        
        for(int i = 1 ; i <= a ; i++){
            d = scan.nextInt();
            c[i-1] = d;
        }
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] < b){
                System.out.print(c[i]+" ");
            }
        }
    }
}