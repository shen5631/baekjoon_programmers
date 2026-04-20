class Solution {
    public String[] solution(String[] strArr) {

        int a [] = new int [strArr.length];
        int cnt = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            if(-1 != strArr[i].indexOf("ad")){
                a[i]++;
            }
            else{
                cnt++;
            }
        }
        String[] answer = new String[cnt];
        cnt = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == 0){
                answer[cnt++]=strArr[i];
            }
        }
        
        return answer;
    }
}