import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        Stack <String> a = new Stack<>();
        String str [] = new String [my_string.length()];
        
        for(int i = 0 ; i < my_string.length() ; i++){
            str[i] = my_string.charAt(i)+"";
        }
        
        for(int i = 0 ; i < queries.length ;i++){
            for(int j = queries[i][0] ; j <= queries[i][1] ; j++ ){
                a.push(str[j]);
            }
            for(int j = queries[i][0] ; j <= queries[i][1] ; j++ ){
                str[j] = a.pop();
            }
        }
        System.out.println(Arrays.toString(str));
        for(int i = 0 ; i < my_string.length() ; i++){
            answer += str[i];
        }
        return answer;
    }
}