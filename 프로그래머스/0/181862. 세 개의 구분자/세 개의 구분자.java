import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        

        
        StringTokenizer a = new StringTokenizer(myStr,"a");
        ArrayList<String> a_l = new ArrayList<>();
        int cnt = a.countTokens();
        for(int i = 0 ; i < cnt ; i++){
            a_l.add(a.nextToken());
        }
        
        // for(int i = 0 ; i < cnt ; i++){
        //     System.out.print(a_l.get(i)+" ");
        // }
        // System.out.println();
        
        ArrayList<String> b_l = new ArrayList<>();
        for(int i = 0 ; i < a_l.size() ; i++){
            StringTokenizer b = new StringTokenizer(a_l.get(i),"b");
            cnt = b.countTokens();
            for(int j = 0 ; j < cnt ; j++){
                b_l.add(b.nextToken());
            }
        }
        
        // for(int i = 0 ; i < cnt ; i++){
        //     System.out.print(b_l.get(i)+" ");
        // }
        // System.out.println();
        
        ArrayList<String> c_l = new ArrayList<>();
        for(int i = 0 ; i < b_l.size() ; i++){
            StringTokenizer c = new StringTokenizer(b_l.get(i),"c");
            cnt = c.countTokens();
            for(int j = 0 ; j < cnt ; j++){
                c_l.add(c.nextToken());
            }
        }
        
        // for(int i = 0 ; i < c_l.size() ; i++){
        //     System.out.print(c_l.get(i)+" ");
        // }
        // System.out.println();

            String answer [] = new String[c_l.size()];
            for(int i = 0 ; i < c_l.size() ; i++){
                answer[i] = c_l.get(i);
            }

        
       String emp [] = {"EMPTY"};
        
        
        
        if(cnt == 0){
            return emp;
        }
        else{
            return answer;            
        }

    }
}