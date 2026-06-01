import java.util.*;
class Solution {
    public int solution(int[][] signals) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int answer = -1;
        
        for(int i = 0; i < signals.length ; i++){
            ArrayList<Integer> two = new ArrayList<>();
            for(int j = 0 ; j < 3 ; j++){
                for(int k = 0 ; k < signals[i][j] ; k++){
                    two.add(j+1);
                }
                
            }
            arr.add(two);
        }
        
        int index [] = new int [signals.length];
        int check [] = new int [signals.length];
        int cnt = 0;
        int long_cnt=1;
        
        while(true){
            for(int i = 0 ; i < signals.length ; i++){
                if(arr.get(i).size() == index[i]){
                    index[i]=0;
                }
            }
            for(int i = 0 ; i < signals.length ; i++){
                check[i] = arr.get(i).get(index[i]);
            }
            //System.out.println(Arrays.toString(check));
            for(int i = 0 ; i < signals.length ; i++){
                if(check[i]==2){
                    cnt++;
                }
            }
            if(cnt == signals.length){
                answer=long_cnt;
                break;
            }
            else{
                cnt=0;
            }
            for(int i = 0 ; i < signals.length ; i++){
                index[i]++;
            }
            
            if(long_cnt++ == 10000000){
                break;
            }
            
        }
        
        //System.out.println(arr);
        return answer;
    }
}