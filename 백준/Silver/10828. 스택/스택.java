import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = scan.nextInt();
        String text = scan.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String arr [] = line.split(" ");
            if(arr[0].equals("push")){
                stack.push(Integer.parseInt(arr[1]));
            } else if (arr[0].equals("pop")) {
                if (!stack.empty()) System.out.println(stack.pop());
                else System.out.println(-1);

            } else if (arr[0].equals("top")) {
                if (!stack.empty()) System.out.println(stack.peek());
                else System.out.println(-1);

            } else if (arr[0].equals("size")) {
                System.out.println(stack.size());
            }
            else if (arr[0].equals("empty")){
                System.out.println(stack.empty() ? 1 : 0);
            }
        }
    }
}
