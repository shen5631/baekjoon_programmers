import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b [] = new String[a.length()];
        String c = "";
        int a1 = 0;
        for(int i = 0 ; i < a.length() ; i++){
            b[i]=a.charAt(i)+"";
        }
        for(int i = 0 ; i < b.length ; i++){
            switch (b[i]){
                case "A": 
                case"B":
                case"C" :c+="2"; break;
                case "D" : 
                case"E" : 
                case "F" : c+="3"; break;
                case "G": 
                case "H":
                case "I" : c+="4"; break;
                case "L" : 
                case"K" :
                case "J" : c+="5"; break;
                case "M" : 
                case "N" :
                case "O" : c+="6"; break;
                case "P" : 
                case "Q" : 
                case "R" : 
                case "S" : c+="7"; break;
                case "V" :
                case "U" : 
                case "T" : c+="8"; break;
                case "W" : 
                case "Y" : 
                case "Z" : 
                case "X" : c+="9"; break;
            }
        }
        String d [] = new String[c.length()];
        for(int i = 0 ; i < c.length() ; i++){
            d[i]=c.charAt(i)+"";
        }
        for(int i = 0 ; i < d.length ; i++){
            a1+=Integer.parseInt(d[i])+1;
        }
        System.out.println(a1);
    }
}