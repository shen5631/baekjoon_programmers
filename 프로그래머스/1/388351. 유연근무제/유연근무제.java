import java.util.*;
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean list [] = new boolean [schedules.length];
        ArrayList <Integer> day = new ArrayList <>();
        
        for(int i = 0 ; i < 7 ; i++ ){
            day.add(i+1);
        }
        
        for(int i = 0 ; i < list.length ; i++ ){
            list[i] = true;
        }
        
        int h [] = new int [list.length];
        int m [] = new int [list.length];
        int time [] = new int[list.length];
        
        for(int i = 0 ; i < h.length ; i++){
            h[i] = schedules[i]/100;
        }
        
        for(int i = 0 ; i < h.length ; i++){
            m[i] = schedules[i]%100+10;
        }
        
        for(int i = 0 ; i < h.length ; i++){
            if(m[i] >= 60){
                m[i]-=60;
                h[i]++;
            }
        }
        
        for(int i = 0 ; i < h.length ; i++){
            time[i] = h[i]*100+m[i];
        }
        
        for(int i = 0 ; i < timelogs.length ; i++){
            for(int j = 0 ; j < timelogs[i].length ; j++){
                if(time[i] < timelogs[i][j] && day.get(startday-1) != 6 && day.get(startday-1) != 7 ){
                    System.out.println(time[i] +" "+timelogs[i][j]+" "+day.get(startday-1) );
                    list[i] = false;
                }
                day.add(day.remove(0));
            }
            if(list[i]){
                answer++;
            }
        }
        
        System.out.println(Arrays.toString(list));
        
        
        
        return answer;
    }
}