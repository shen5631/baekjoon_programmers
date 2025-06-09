import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int a1 = 0;
        
        int b = 0;
        
        int a = scan.nextInt();
        
        int c[]= new int[a];
        
        for(int i = 1 ; i <= a ; i++){
            b = scan.nextInt();
            c[i-1]= b;
        }
        
        int d = scan.nextInt();
        for(int i = 0 ; i < c.length ; i++){
            if(c[i]==d)
                a1++;
        }
        System.out.print(a1);
    }
}