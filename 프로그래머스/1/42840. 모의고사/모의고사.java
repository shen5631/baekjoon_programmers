import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int [][] patten = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        
        int check[] = new int[3];
        
        
        for(int i = 0 ; i < answers.length ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(patten[j][i%patten[j].length] == answers[i]){
                    check[j]++;
                }
            }
        }
        
        ArrayList<Integer> a = new ArrayList<>();
        
        int max = 0;
        
        for(int i = 0 ; i < 3 ; i++){
            if(check[i]>=max){
                max=check[i];   
            }
        }
        
        for(int i = 0 ; i < 3 ; i++){
            if(check[i]==max){
                a.add(max);
            }
        }
        
        int index [] = new int[a.size()];
        
        int cnt = 0;
        for(int i = 0 ; i < 3 ; i++){
            if(check[i]==max){
                index[cnt++]=i;
            }
        }

        for(int i = 0 ; i < index.length ; i++){
            index[i]++;
        }
        
        return index;
    }
}