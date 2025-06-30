import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        String b []= new String[a];
        for(int i = 0 ; i < a ; i++){
            b[i]=scan.next();
        }
        for(int i = 0 ; i < a ; i++){
            System.out.print(b[i].charAt(0)+""+b[i].charAt(b[i].length()-1)+"");
            System.out.println();
        }
    }
}