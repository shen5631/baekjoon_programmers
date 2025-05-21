import java.util.Scanner;
class Main{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        for(int i = 1 ; i <=a ; i++){
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            System.out.println("Case #"+i+": "+(b+c));
        }
        
    }
}