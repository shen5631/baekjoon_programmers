import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList <Integer> a = new ArrayList<>();
        for(int i = 0 ; i < numbers.length ;i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                a.add(numbers[i]+numbers[j]);
            }
        }
        
        HashSet <Integer> b = new HashSet<>();
        
        for(int i = 0 ; i < a.size() ; i++){
            b.add(a.get(i));
        }
        
        Iterator<Integer> c = b.iterator();
        int [] answer = new int[b.size()];
        for(int i = 0 ; i < b.size() ; i++){
            answer[i]=c.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}