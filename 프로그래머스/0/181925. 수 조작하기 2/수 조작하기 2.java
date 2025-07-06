class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 1 ; i < numLog.length ; i++){
            if(numLog[0]+1==numLog[i]){
                answer+="w";
                numLog[0]+=1;
            }
            else if(numLog[0]-1==numLog[i]){
                answer+="s";
                numLog[0]-=1;
            }
            else if(numLog[0]+10==numLog[i]){
                answer+="d";
                numLog[0]+=10;
            }
            else if(numLog[0]-10==numLog[i]){
                answer+="a";
                numLog[0]-=10;
            }
        }
        return answer;
    }
}