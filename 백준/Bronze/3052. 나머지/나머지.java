import java.util.Scanner;
class Main{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int a[] = new int[10];
        int cnt=0;

        for(int i = 0 ; i < 10 ; i++)
            a[i]=scan.nextInt();

        for(int i = 0 ; i < 10 ; i++) {
            for (int j = 0; j < i; j++)
                if (i != j)
                    if (a[i]%42 == a[j]%42) {
                        cnt++;break;
                    }
        }
        if(cnt==10)
            System.out.println("1");
        else
        System.out.println((10-cnt));
    }
}