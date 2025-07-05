import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b [] = new String[a.length()];
        int cnt=0;
        for(int i = 0 ; i < a.length() ; i++){
            b[i] = a.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            if(b[i].equals(" "))
                cnt++;
        }
        if(b[0].equals(" ") && b[b.length-1].equals(" "))
            System.out.println(cnt-1);
        else if(b[0].equals(" "))
            System.out.println(cnt);
        else if (b[b.length-1].equals(" "))
            System.out.println(cnt);

        else
            System.out.println(cnt+1);
    }
}