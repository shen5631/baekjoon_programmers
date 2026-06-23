import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        HashMap<String,Integer>map = new HashMap <>();
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0 ; i < X.length() ; i++){
            String str = X.charAt(i)+"";
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        
        for(int i = 0 ; i < Y.length() ; i++){
            String str = Y.charAt(i)+"";
            if(map.containsKey(str)){
                map.put(str,map.get(str)-1);
                arr.add(str);
                if(map.get(str) == 0){
                    map.remove(str);
                }
            }
        }
        
        //System.out.println(arr);
        String arr1 [] = new String [arr.size()];
        for(int i = 0 ; i < arr.size() ; i++){
            arr1[i]=arr.get(i);
        }
        
        Arrays.sort(arr1);
        
        //System.out.println(Arrays.toString(arr1));
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr1.length ; i++){
            sb.append(arr1[i]);
        }
        
        sb.reverse();
        
        if(sb.length() == 0){
            sb.append("-1");
        }
        
        String check = sb.charAt(sb.length()-1)+"";
        
        answer=sb.toString();
        
        answer = answer.replaceAll("(\\b0+)","");
        
        if(check.equals("0") && answer.length() == 0){
            answer+="0";
        }
        
//         int su = Integer.parseInt(answer);
        
//         //System.out.println(su);
        
//         answer=String.valueOf(su);
        
        return answer;
    }
}