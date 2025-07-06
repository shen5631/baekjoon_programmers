import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b [] = new String [a.length()];
        for(int i = 0 ; i < a.length();i++){
            b[i]=a.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            System.out.println(b[i]);
        }
    }
}