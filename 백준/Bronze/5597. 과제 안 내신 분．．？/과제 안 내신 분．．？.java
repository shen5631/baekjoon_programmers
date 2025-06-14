import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a [] = new int[30];
        int b,c,d;
        
        for(int i = 0 ; i < 28 ; i ++){
            b =scan.nextInt();
            a[b-1]=1;
        }
        for(int i = 0 ; i < 30 ; i++){
            if(a[i]!=1){
                System.out.println((i+1));
            }
        }
    }
}