import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b [] = new char [a.length()];
        String c [] = new String [a.length()];
        
        for(int i = 0 ; i < b.length ; i++){
            b[i] = a.charAt(i);
            c[i] = a.charAt(i)+"";
        }
        
        for(int i = 0 ; i < b.length ; i++){
            if((int)b[i] >65 +26){
                c[i]=c[i].toUpperCase();
            }
            else{
                c[i]=c[i].toLowerCase();
            }
            System.out.print(c[i]);  
        }
    }
}