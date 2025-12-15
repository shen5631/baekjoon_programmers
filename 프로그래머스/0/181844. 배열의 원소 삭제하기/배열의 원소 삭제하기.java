class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        int temp =0;
        int temp1 = 0;
        int c =0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < delete_list.length;j++){
                if(arr[i]!=delete_list[j]){
                    temp++;

                    }
            }
            if(temp==delete_list.length){
                    temp1++;
                    temp=0;
                }
                else{
                    temp=0;
                }
        }
        int[] answer = new int [temp1];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < delete_list.length;j++){
                if(arr[i]!=delete_list[j]){
                    temp++;
                    }
            }
            if(temp==delete_list.length){
                    answer[c]=arr[i];
                    temp=0;
                    c++;
                }
                else{
                    temp=0;
                }
        }
        return answer;
    }
}