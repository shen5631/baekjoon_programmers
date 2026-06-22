import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win=0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i] == 0){
                win++;
            }
            map.put(lottos[i],1);
        }
        
        int lose = 0;
        
        for(int i = 0 ; i < win_nums.length ; i++){
            if(map.containsKey(win_nums[i])){
                lose++;
            }
        }
        
        win+=lose;
        
        switch(win){
            case 1,0 : answer[0]=6; break;
            case 2 : answer[0]=5; break;
            case 3 : answer[0]=4; break;
            case 4 : answer[0]=3; break;
            case 5 : answer[0]=2; break;
            case 6 : answer[0]=1; break;
        }
        
        switch(lose){
            case 1,0 : answer[1]=6; break;
            case 2 : answer[1]=5; break;
            case 3 : answer[1]=4; break;
            case 4 : answer[1]=3; break;
            case 5 : answer[1]=2; break;
            case 6 : answer[1]=1; break;
        }
        
        System.out.println(win+" "+lose);
        
        
        return answer;
    }
}