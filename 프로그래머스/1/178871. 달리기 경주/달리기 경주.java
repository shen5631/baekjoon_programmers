import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        int a [] = new int[players.length];
        String temp = "";
        
        HashMap<String,Integer> map = new HashMap<>();
        
         for(int i = 0 ; i < players.length ; i++){
             map.put(players[i],i);
         }
        
        for(int i = 0 ; i < callings.length ; i++){
            temp = players[map.get(callings[i])-1];
            players[map.get(callings[i])-1] = players[map.get(callings[i])];
            players[map.get(callings[i])] = temp;
            
            map.replace(callings[i],map.get(callings[i])-1);
            map.replace(temp,map.get(temp)+1);
        }
        

        

//         for(int i = 0 ; i < callings.length ; i++){
//             for(int j = 0 ; j < players.length ; j++){
//                 if(callings[i].equals(players[j])){
//                     temp = players[j-1];
//                     players[j-1] = callings[i];
//                     players[j] = temp;
//                     break;
//                 }
//             }
//         }
        
        
        
        
        
        
        
        return players;
    }
}