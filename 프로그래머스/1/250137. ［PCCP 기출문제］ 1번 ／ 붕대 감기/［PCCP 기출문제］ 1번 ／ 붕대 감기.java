import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = -1;
        int cnt=0;
        int max=0;
        int hp=health;
        
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < attacks.length ; i++){
            if(max<attacks[i][0]){
                max = attacks[i][0];
            }
            map.put(attacks[i][0],attacks[i][1]);
        }
        
        for(int i = 1 ; i <= max ; i++){
            if(hp==0){
                break;
            }
            if(map.containsKey(i)){
                hp-=map.get(i);
                cnt=0;
                continue;
            }
            cnt++;
            if(bandage[0]==cnt){
                cnt=0;
                hp+=bandage[1]+bandage[2];
                if(hp>health){
                    hp=health;
                }
            }
            else if(hp<=0){
                break;
            }
            else{
                hp+=bandage[1];
                if(hp>health){
                    hp=health;
                }
            }
            
            System.out.println(hp);
        }
        
        
        if(hp > 0){
            answer=hp;
        }
        
        
        return answer;
    }
}