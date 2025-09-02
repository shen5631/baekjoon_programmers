class Solution {
    public int solution(int num) {
        int answer = 0;
        int a = num;
        for(int i = 1 ; i <= 500 ; i++){
            if(num%2==0)
                num=num/2;
            else if(num%2==1)
                num=num*3+1;
            if(num==1){
               answer=i;
                break;
            }
        }
        System.out.print(num);
        if(answer==0)
            answer=-1;
        else if(a==1)
            answer=0;
        return answer;
    }
}