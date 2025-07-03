import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();


        int a,b;
        int i = 0 ;
        do{

            a = scan.nextInt();
            b = scan.nextInt();

            if(a==b && b ==0)
                break;

            list.add(a);
            list1.add(b);


        }while (true);
        for(int j = 0; j < list.size() ; j++){
            System.out.println((list.get(j)+list1.get(j)));
        }


    }
}