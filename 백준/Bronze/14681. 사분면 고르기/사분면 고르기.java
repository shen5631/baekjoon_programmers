import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        if(a>0&&b>0){
            System.out.print("1");
        }
        else if(a<0&&b>0){
            System.out.print("2");
    }
        else if(a<0&&b<0){
            System.out.print("3");
        }
        else{
            System.out.print("4");
        }
}
}