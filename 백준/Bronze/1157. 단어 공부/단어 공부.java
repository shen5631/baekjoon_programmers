import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        String a1 = a.toUpperCase();

        char b [] = new char[a.length()];

        int c [] = new int[26];

        for(int i = 0 ; i < a1.length() ; i++){
            b [i] = a1.charAt(i);
        }

        for(int i = 0 ; i < 26 ; i++){
            for(int j = 0 ; j < b.length ; j++){
                if(65+i == (int)b[j]){
                    c[i]++;
                }
            }
        }
        int max2=0;
        int max = c[0];
        int index= 65;
        int temp;

        for(int i = 0 ; i < 26; i++){
            if(max<c[i]){
                max=c[i];
                index=i+65;
            }
        }

        for(int i = 0 ; i < 26 ; i++){
            for(int j = i ; j < 26; j++){
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        max = c[c.length-1];
        max2 = c[c.length-2];
        if(max==max2){
            System.out.println("?");
        }
        else{
            System.out.println((char)index);
        }
    }
}
