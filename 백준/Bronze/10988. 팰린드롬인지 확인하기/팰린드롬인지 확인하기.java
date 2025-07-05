import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b [] = new String[a.length()];
        String c [] = new String[a.length()];
        int d = c.length-1;
        int cnt=0;
        for(int i = 0 ; i < a.length() ; i++){
            b[i]=a.charAt(i)+"";
            c[i]=a.charAt(i)+"";
        }

        for(int i = 0 ; i < a.length() ; i++){
            if(b[i].equals(c[d]))
                cnt++;
            d--;
        }
        if(cnt==a.length())
            System.out.println("1");
        else
            System.out.println("0");

    }
}