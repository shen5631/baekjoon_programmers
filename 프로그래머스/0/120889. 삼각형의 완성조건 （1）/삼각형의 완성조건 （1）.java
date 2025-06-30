class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=0;
        int cnt=0;
        for(int i = 0 ; i < sides.length ; i++){
            if(max<sides[i]){
                max=sides[i];
                cnt=i;
            }
        }
        if(cnt==0 && sides[1]+sides[2]>sides[0])
            answer=1;
        else if(cnt==1 && sides[0]+sides[2]>sides[1])
            answer=1;
        else if(cnt==2 && sides[1]+sides[0]>sides[2])
            answer=1;
        else
            answer=2;
        
        return answer;
    }
}