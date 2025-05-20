import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        int b=0;
        
        for(int i=1;i<=a;i++){
            b+=i;
        }
        System.out.print(b);
    }
}