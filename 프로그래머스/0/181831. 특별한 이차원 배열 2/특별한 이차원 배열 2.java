class Solution {
    public int solution(int[][] arr) {
        int cnt = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j]==arr[j][i])
                    cnt++;
            }
        }
            int answer = 0;
        if(cnt==arr.length*arr[0].length)
            answer++;
        return answer;
    }
}