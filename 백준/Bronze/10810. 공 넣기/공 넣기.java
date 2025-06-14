import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int ba = scan.nextInt();
        int su = scan.nextInt();
        
        int su1,su2,su3;
        
        int ba1[] = new int [ba];
        
        for(int i = 0 ; i < su ; i++){
            su1=scan.nextInt();
            su2=scan.nextInt();
            su3=scan.nextInt();
            for(int j = su1-1 ; j < su2 ; j++){
                ba1[j]=su3;
            }
        }
        for(int i = 0 ; i < ba ;i++)
        System.out.print(ba1[i]+" ");
    }
}