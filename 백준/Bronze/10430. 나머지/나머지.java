import java.util.Scanner;
class Main{
     public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
             int A=scan.nextInt();
             int B=scan.nextInt();
             int C=scan.nextInt();
             System.out.println((A+B)%C);
             System.out.println(((A%C)+(B%C))%C);
             System.out.println((A*B)%C);
             System.out.println(((A%C)*(B%C))%C);
     }
}