import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate day = LocalDate.of(2016,a,b);
        System.out.println();
        
        answer = String.valueOf(day.getDayOfWeek());
        String str = "";
        
        for(int i = 0 ; i < 3 ;i++){
            str+=answer.charAt(i)+"";
        }
        
        return str;
    }
}