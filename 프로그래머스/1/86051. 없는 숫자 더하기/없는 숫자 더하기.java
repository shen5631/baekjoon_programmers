class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int j = 0; j < numbers.length ; j++){
            for(int i = 0 ; i < 9 ; i++){
                if(numbers[j]==a[i])
                    a[i]=0;
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]);
            answer+=a[i];
        }        
        return answer;
    }
}