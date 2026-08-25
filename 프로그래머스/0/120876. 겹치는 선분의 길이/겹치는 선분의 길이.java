class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int line [] = new int [300];
        
        for(int i = 0 ; i < 3 ; i++){
            for(int j = lines[i][0]-1 ; j < lines[i][1]-1 ; j++){
                    line[j+150]++;
            }
        }
        
        for(int i = 0 ; i < line.length ; i++ ){
            if(line[i]>1){
                answer++;
            }
        }
        
        return answer;
    }
}