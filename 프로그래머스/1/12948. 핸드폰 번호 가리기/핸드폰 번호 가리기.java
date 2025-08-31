class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String a [] = new String [phone_number.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=phone_number.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++){
           if(i < a.length-4){
               answer+="*";
           }
            else
                answer+=a[i];
        }
        return answer;
    }
}