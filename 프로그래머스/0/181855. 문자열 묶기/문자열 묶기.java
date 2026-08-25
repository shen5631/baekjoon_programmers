class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int a [] = new int[30];
        
        for(int i = 0 ; i < strArr.length ; i++){
            for(int j = 0 ; j < 30 ; j++){
                if(strArr[i].length()==j+1){
                    a[j]++;
                }
            }
        }
        
        for(int i = 0 ; i < a.length ; i++){
            if(answer<a[i]){
                answer=a[i];
            }
        }
        return answer;
    }
}