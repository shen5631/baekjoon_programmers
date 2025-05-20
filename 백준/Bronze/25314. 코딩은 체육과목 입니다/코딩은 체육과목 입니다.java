import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        int a = scan.nextInt();
        
        for(;a>0;a-=4){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}