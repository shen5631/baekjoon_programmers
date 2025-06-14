import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        
        int ba = scan.nextInt();
        int su = scan.nextInt();
        
        int ba1[]= new int [ba];
        
        int a,b,c;
        
        for(int i = 0 ; i < ba ; i++)
            ba1[i] = i+1;
        
        for(int i = 0 ; i < su ; i++){
            a = scan.nextInt();
            b = scan.nextInt();
            c=ba1[a-1];
            ba1[a-1]=ba1[b-1];
            ba1[b-1]=c;     
        }
        for(int i = 0 ; i < ba ; i++)
            System.out.print(ba1[i]+" ");
    }
}