import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap <String,Integer> map = new HashMap<>();
        HashMap <String,Integer> user = new HashMap<>();
        HashMap <String,Integer> check = new HashMap<>();
        HashMap <String,Integer> un_check = new HashMap<>();
        int[] answer = new int [id_list.length];
        ArrayList<String> arr1 = new ArrayList<>();
        
        Arrays.sort(report);
        
        for(int i = 0 ; i < id_list.length ; i++){
            user.put(id_list[i],0);
        }
        
        String check_arr1 [] = report[0].split(" ");
        
        String check_str1 = check_arr1[0];
        
        
        for(int i = 0 ; i < report.length ; i++){
            String arr [] = report[i].split(" ");
            String ck = arr[1];
            
            if(!check_str1.equals(arr[0])){
                un_check.clear();
            }
            
            if(map.containsKey(ck)){
                if(!un_check.containsKey(ck)){
                    map.put(ck,map.get(ck)+1);
                    un_check.put(ck,0);
                }
            }
            else{
                if(!un_check.containsKey(ck)){
                    map.put(ck,1);
                    un_check.put(ck,0);
                }
            }
            
            check_str1 = arr[0];
        }
        
        System.out.println(map);
        
        for(int i = 0 ; i < id_list.length ; i++){
            if(map.containsKey(id_list[i])){
                if(map.get(id_list[i]) < k){
                    map.remove(id_list[i]);
                }
            }
        }
        
        
        
        String check_arr [] = report[0].split(" ");
        
        String check_str = check_arr[0];
        
        for(int i = 0 ; i < report.length ; i++){
            String arr [] = report[i].split(" ");
            String ck = arr[1];
            
            if(!check_str.equals(arr[0])){
                check.clear();
            }
            
            if(map.containsKey(ck)){
                if(!check.containsKey(ck)){
                    user.put(arr[0],user.get(arr[0])+1);
                    check.put(ck,0);
                }
            }
            
            check_str = arr[0];
            
        }
        
        System.out.println(user);
        
        for(int i = 0 ; i < user.size() ; i++){
            answer[i] = user.get(id_list[i]);
        }
        
        return answer;
    }
}