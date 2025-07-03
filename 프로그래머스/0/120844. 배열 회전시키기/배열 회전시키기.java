class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        int a = numbers[0];
        int b[] = new int[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            b[i]=numbers[i];
        }
        if(direction.equals("right"))
            for(int i = 0 ; i < numbers.length ; i++){
                if(i+1==numbers.length)
                    numbers[0]=b[b.length-1];
                else{
                    numbers[i+1]=b[i];
                } 
                    
            }
        else
            for(int i = numbers.length-1 ; i >= 0 ; i--){
                if(i==0)
                    numbers[b.length-1] = b[0];
                else{
                    numbers[i-1]=b[i];
                } 
                    
            }
        return numbers;
    }
}