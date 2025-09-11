class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int cnt = 0;
        int a =0;
        for(int i = intervals[0][0] ; i <= intervals[0][1];i++ ){
            cnt++;
        }
        for(int i = intervals[1][0] ; i <= intervals[1][1];i++ ){
            cnt++;
        }
        int[] answer = new int [cnt];
        for(int i = intervals[0][0] ; i <= intervals[0][1];i++ ){
            answer[a++]=arr[i];
        }
        for(int i = intervals[1][0] ; i <= intervals[1][1];i++ ){
            answer[a++]=arr[i];
        }
        return answer;
    }
}