class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int a;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i]>array[j]){
                    a = array[j];
                    array[j]=array[i];
                    array[i]=a;
                }
            }
        }
        for(int i = 0 ; i < array.length ; i ++){
            System.out.print(array[i]+" ");
        }
        a=array.length/2;
        answer=array[a];
        return answer;
    }
}