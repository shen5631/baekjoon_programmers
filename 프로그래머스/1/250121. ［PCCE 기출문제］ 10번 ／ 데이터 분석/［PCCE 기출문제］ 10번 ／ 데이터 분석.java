import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int check = 0;
        int check1 = 0;
        
        if(ext.equals("code")){
            check=0;
        }
        else if(ext.equals("date")){
            check=1;
        }
        else if(ext.equals("maximum")){
            check=2;
        }
        else if(ext.equals("remain")){
            check=3;
        }
        
        if(sort_by.equals("code")){
            check1=0;
        }
        else if(sort_by.equals("date")){
            check1=1;
        }
        else if(sort_by.equals("maximum")){
            check1=2;
        }
        else if(sort_by.equals("remain")){
            check1=3;
        }
        
        ArrayList <Integer> arr = new ArrayList <>();
    
        for(int i = 0 ; i < data.length ; i++){
            if(data[i][check] <= val_ext){
                arr.add(data[i][0]);
            }
        }
        
        int[][] answer = new int [arr.size()][4];
        int cnt=0;
        
        for(int i = 0 ; i < data.length ; i++){
            if(cnt == arr.size())break;
            if(arr.get(cnt) == data[i][0]){
                answer[cnt][0] = data[i][0];
                answer[cnt][1] = data[i][1];
                answer[cnt][2] = data[i][2];
                answer[cnt][3] = data[i][3];
                cnt++;
            }
        }
        
        int temp []= new int[4];
        
        for(int i = 0 ; i < answer.length ; i++){
            for(int j = i+1 ; j < answer.length ; j++){
                if(answer[i][check1] > answer[j][check1]){
                    temp[0] = answer[i][0];
                    temp[1] = answer[i][1]; 
                    temp[2] = answer[i][2]; 
                    temp[3] = answer[i][3]; 
                    
                    answer[i][0] = answer[j][0];
                    answer[i][1] = answer[j][1];
                    answer[i][2] = answer[j][2];
                    answer[i][3] = answer[j][3];
                    
                    answer[j][0] = temp[0];
                    answer[j][1] = temp[1];
                    answer[j][2] = temp[2];
                    answer[j][3] = temp[3];
                }
            }
        }
        return answer;
    }
}