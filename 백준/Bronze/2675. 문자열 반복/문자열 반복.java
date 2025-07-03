import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b [] =new int[a];
        String c []= new String[a];

        for(int i = 0 ; i < a ; i++){
            b[i]=scan.nextInt();
            c[i]= scan.next();
        }
        for(int k = 0 ; k < a ; k++) {
            for (int i = 0; i < c[k].length(); i++) {
                for (int j = 0; j < b[k]; j++) {
                    System.out.print(c[k].charAt(i) + "");
                }
            }
            System.out.println();
        }
    }
}