import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        ArrayList <Integer> ar = new ArrayList<>();
        int i_today = Integer.parseInt(today.replace(".",""));
        //System.out.println(s_today);
        
        HashMap <String,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < terms.length ; i++){
            String arr[] = terms[i].split(" ");
            
            map.put(arr[0],Integer.parseInt(arr[1]));
        }
        
        for(int i = 0 ; i < privacies.length ; i++){
            privacies[i] = privacies[i].replace(" ",".");
            String arr [] = privacies[i].split("\\.");
            
            int day_arr [] = {Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2])};
            String grade = arr[3];

            //System.out.println(Arrays.toString(day_arr));
            
            day_arr[0]+=(day_arr[1]+map.get(grade))/12;
            day_arr[1]=(day_arr[1]+map.get(grade))%12;
            
            if(day_arr[1] == 0){
                day_arr[1]=12;
                day_arr[0]--;
            }
            
            //System.out.println(Arrays.toString(day_arr));
            String temp_total = String.valueOf(day_arr[0]);
            String temp ="";
            if(String.valueOf(day_arr[1]).length() == 1){
                temp += "0";
            }
            temp += String.valueOf(day_arr[1]);
            temp_total+=temp;
            temp="";
            if(String.valueOf(day_arr[2]).length() == 1){
                temp += "0";
            }
            temp += String.valueOf(day_arr[2]);
            temp_total+=temp;
            System.out.println(temp_total);
            
            int total = Integer.parseInt(temp_total);
            
            if(total <= i_today){
                ar.add(i+1);
            }
        }
        System.out.println(ar);
        int[] answer = new int [ar.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = ar.get(i);
        }

        return answer;
    }
}