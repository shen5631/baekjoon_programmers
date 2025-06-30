import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        String b [] = new String[a];
        int sum=0;
        String c;
            c = scan.next();
        for(int i = 0 ; i < a ; i++){
            b[i]=c.charAt(i)+"";
        }
        for(int i = 0 ; i < a ; i++){
            sum+=Integer.parseInt(b[i]);
        }
        System.out.print(sum);
    }
}