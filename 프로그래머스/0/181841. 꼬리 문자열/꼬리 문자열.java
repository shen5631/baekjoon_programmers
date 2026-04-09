class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        int a [] = new int [str_list.length];
        
        for(int i = 0 ; i < a.length ; i++){
            if(-1 != str_list[i].indexOf(ex)){
                a[i]++;
            }
        }
        
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == 0){
                answer+=str_list[i];
            }
        }
        return answer;
    }
}