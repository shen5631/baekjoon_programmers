class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0 ; i < num_list.length ; i++){
            answer[i]=num_list[i];
        }
        int max;
        for(int i = 0 ; i < num_list.length ; i++){
            for(int j = i+1 ; j < num_list.length ; j++){
                if(answer[i]>answer[j]){
                    max=answer[i];
                    answer[i]=answer[j];
                    answer[j]=max;
                }
            }
        }
        int a [] = new int [answer.length-5];
        int b = 0;
        for(int i = 5 ; i < answer.length ; i++){
            a[b]=answer[i];
            ++b;
        }
        return a;
    }
}