class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int cnt = 0 ;
        int a = 0 ;
        if(n == 1){
            cnt = slicer[1]+1;
        }
        else if(n == 2){
            cnt = num_list.length - slicer[0];
        }
        else if(n == 3){
            cnt = slicer[1] - slicer[0] + 1;
        }
        else if(n == 4){
            cnt = (slicer[1] - slicer[0] + 1)/slicer[2];
            if(((double)(slicer[1] - slicer[0] + 1)/slicer[2]) > cnt ){
                cnt++;
            }
        }
        int[] answer = new int [cnt];
        
        if(n == 1){
            for(int i = 0 ; i <= slicer[1] ; i ++){
                answer[a++]=num_list[i];
            }
        }
        else if(n == 2){
            for(int i = slicer[0] ; i < num_list.length ; i++ ){
                answer[a++]=num_list[i];
            }
        }
        else if (n == 3){
            for(int i = slicer[0] ; i <= slicer[1] ; i++ ){
                answer[a++]=num_list[i];
            }
        }
        else if (n == 4){
            for(int i = slicer[0] ; i <= slicer[1] ; i+=slicer[2] ){
                    answer[a++]=num_list[i];
            }
        }
        return answer;
    }
}