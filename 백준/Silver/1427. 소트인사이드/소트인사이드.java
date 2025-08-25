import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b ="";
        String a1 [] = new String[a.length()];
        int temp = 0;
        int b1 [] = new int[a1.length];
        for(int i = 0 ; i < a1.length ; i++){
            a1[i]=a.charAt(i)+"";
        }
        for(int i = 0 ; i < a1.length ; i++){
            b1[i]=Integer.parseInt(a1[i]);
        }

        for(int i = 0 ; i < a1.length ; i++){
            for(int j = i ; j < a1.length ; j++){
                if(b1[i]<b1[j]){
                    temp = b1[i];
                    b1[i]=b1[j];
                    b1[j]=temp;
                }
            }
        }

        for(int i = 0 ; i < a1.length ; i++){
            System.out.print(b1[i]);
        }
    }
}
