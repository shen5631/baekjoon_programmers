1
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
25
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals(
"_eye"
)){
            System.out.println("Ophthalmologyc");
        }
        else if(
lastFourWords.equals( "head" )
){
            System.out.println("Neurosurgery");
        }
        else if(
lastFourWords.equals( "infl" )
){
            System.out.println("Orthopedics");
        }
        
else if(lastFourWords.equals( "skin" ))
{
            System.out.println("Dermatology");
        }
        
else
{
            System.out.println("direct recommendation");
        }
    }
}