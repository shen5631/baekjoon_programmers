import java.util.*;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            if(i+1 == a || i+1 == b){
                list.add("a"+(i+1));
            }
            else{
                list.add(""+(i+1));
            }
        }
        String a1 = "";
        String b1 ="";
        int str_cnt=0;
        int cnt = 0;
        
        int a_ix = 0;
        int b_ix = 0;
        while(true){
            if(a1.equals("") && !list.get(cnt%n).equals("0")){
                a1 = list.get(cnt%n);
                a_ix = cnt%n;
                str_cnt++;
            }
            else if(b1.equals("") && !list.get(cnt%n).equals("0")){
                b1 =list.get(cnt%n);
                b_ix = cnt%n;
                str_cnt++;
            }
            
            
            
            if(a1.indexOf("a") == -1 && b1.indexOf("a") == -1 && str_cnt == 2){
                //System.out.println("!"+a1+b1);
                a1 = "";
                b1 = "";
                list.set(b_ix,"0");
                str_cnt=0;
            }
            else if(a1.indexOf("a") == -1 && str_cnt == 2){
                //System.out.println("@"+a1+b1);
                a1 = "";
                b1 = "";
                list.set(a_ix,"0");
                str_cnt=0;
            }
            else if(b1.indexOf("a") == -1 && str_cnt == 2){
                //System.out.println("#"+a1+b1);
                a1 = "";
                b1 = "";
                list.set(b_ix,"0");
                str_cnt=0;
            }
            else if(str_cnt == 2){
                break;
            }
            if(cnt % n == 0){
                answer++;
            }
            cnt++;
            
        }
        System.out.println(cnt);

        return answer;
    }
}