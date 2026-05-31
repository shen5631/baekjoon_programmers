class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int temp =0;

        for(int i = 0; i < citations.length ; i++){
            for(int j = i + 1 ; j < citations.length ; j++){
                if(citations[i]<citations[j]){
                    temp = citations[i];
                    citations[i] = citations[j];
                    citations[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < citations.length ; i++){
            if(i+1 <= citations[i]){
                answer = i+1;
            }
        }


        return answer;
    }
}