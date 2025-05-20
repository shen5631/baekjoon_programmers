import java.util.Scanner;
    class Main{
        public static void main(String[]args){
            Scanner scan=new Scanner(System.in);
            
            int a=scan.nextInt();
            
            int b=scan.nextInt();
            
            int e=0;
            
            for(int i = 1;i <= b; i++){
                int c=scan.nextInt();
                int d=scan.nextInt();
                
                e+=c*d;
                
                
            }
            if(e==a){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }
        }
    }