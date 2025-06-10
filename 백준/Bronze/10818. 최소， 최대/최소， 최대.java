import java.util.Scanner;
    class Main{
        public static void main(String[]args){
            Scanner scan = new Scanner (System.in);
            
            int a = scan .nextInt();
            int b;
            int c [] = new int[a];
            int d;
            int e;
            for(int i = 0 ; i < a ; i++){
                b = scan.nextInt();
                c[i] =b;
            }
            d = c[0];
            e = c[0];
            for(int i = 0 ; i < a ; i++){
                if(d<c[i])
                    d = c[i];
                if(e>c[i])
                    e = c[i];
            }
            System.out.print(e+" "+d);
        }
    }