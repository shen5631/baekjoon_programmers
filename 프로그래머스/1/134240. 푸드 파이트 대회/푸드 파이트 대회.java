import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(0);
        for(int i = food.length-1 ; i >= 1 ; i --){
            while(food[i] > 1){
                dq.offerLast(i);
                dq.offerFirst(i);
                food[i]-=2;
            }
        }
        System.out.print(dq);
        int size = dq.size();
        for(int i = 0 ; i < size; i++){
            answer+=String.valueOf(dq.pollFirst());
        }
        return answer;
    }
}