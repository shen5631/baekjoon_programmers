import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i = 0 ; i < reserve.length ; i++){
            map.put(reserve[i],1);
        }
        
        for(int i = 0 ; i < lost.length ; i++){
            list.add(lost[i]);
        }
        
        for(int i = 0 ; i < lost.length ; i++){
            if(map.containsKey(lost[i])){
                list.set(i,-5);
                map.remove(lost[i]);
            }
        }
        
        for(int i = 0 ; i < lost.length ; i++){
            if(map.containsKey(lost[i]-1)){
                list.set(i,-5);
                map.remove(lost[i]-1);
            }
            else if(map.containsKey(lost[i]+1)){
                list.set(i,-5);
                map.remove(lost[i]+1);
            }
        }
        
        System.out.println(list);
        int cnt=0;
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i)!=-5){
                cnt++;
            }
        }
        
        answer-=cnt;
        
        return answer;
    }
}