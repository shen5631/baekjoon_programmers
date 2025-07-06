import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a [][]=new int[100][100];

        int cnt=0;
        int num = scan.nextInt();
        int b, c;
        for(int i = 0 ; i < num ; i++){
            b= scan.nextInt();
            c= scan.nextInt();
            for(int j = 0 ; j < 10 ;j++){
                for(int k = 0 ; k < 10 ; k++){
                    a[b-1+j][c-1+k]=1;
                }
            }
        }
        for(int j = 0 ; j < 100 ;j++){
            for(int k = 0 ; k < 100 ; k++){
                if(a[j][k]==1)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}