class Solution {
    public int solution(int[][] triangle) {
        int end = triangle.length-1;
        int max []= new int[triangle[end].length];
        for(int i = end ; i >= 0 ; i--){
            for(int j = 0 ; j < triangle[i].length-1 ; j++){
                if(triangle[i][j] >= triangle[i][j+1]) max[j]=triangle[i][j];
                else max[j]=triangle[i][j+1];
                triangle[i-1][j]+=max[j];
            }

        }

        return triangle[0][0];
    }
}