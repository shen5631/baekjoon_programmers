
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += 
before;
;
            month++;
        }
        while (
money
 < 100) {
            
money+=after;
;
            month++;
        }

        System.out.println(month);
    }
}
