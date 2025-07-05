import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);

        String a2[] = new String[3];
        String b2[] = new String[3];

        String a3[] = new String[3];
        String b3[] = new String[3];

        for(int i = 0 ; i < a2.length ; i++){
            a2[i]=a1.charAt(i)+"";
            b2[i]=b1.charAt(i)+"";
        }

        int e = 2;
        for(int i = 0 ; i < a1.length() ; i++){
            a3[i] =a2[e];
            b3[i] =b2[e];
            e--;
        }
        a1 ="";
        b1 ="";

        for(int i = 0 ; i < a3.length ; i++){
            a1 +=a3[i];
            b1 +=b3[i];
        }


        int c = Integer.parseInt(a1);
        int d = Integer.parseInt(b1);

        if(c>d)
            System.out.println(c);
        else
            System.out.println(d);
    }
}