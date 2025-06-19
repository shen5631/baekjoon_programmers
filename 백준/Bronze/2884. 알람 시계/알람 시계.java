import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        if(a==0&&b<45){
            System.out.println("23 "+(60+(b-45)));
        }
        else if(a>0&&b<45){
            System.out.println((a-1)+" "+(60+(b-45)));
        }
        else
            System.out.println(a+" "+(b-45));
            
    }
}