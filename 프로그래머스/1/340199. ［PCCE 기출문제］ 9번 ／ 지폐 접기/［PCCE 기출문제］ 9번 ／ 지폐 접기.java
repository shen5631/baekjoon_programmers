class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int max = (bill[0] >= bill[1]) ? bill[0] : bill[1];
        int min = (bill[0] <= bill[1]) ? bill[0] : bill[1];
        int ji1 = (wallet[0] >= wallet[1]) ? wallet[0] : wallet[1];
        int ji2 = (wallet[0] <= wallet[1]) ? wallet[0] : wallet[1];
        int temp;
        int cnt=0;
        
        
        wallet[0]=ji1;
        wallet[1]=ji2;
        bill[0]=max;
        bill[1]=min;
        
        while(true){
            if(ji1<bill[0]){
                bill[0]/=2;
            }
            else{
                if(ji2 < bill[1]){
                    bill[0]/=2;
                }
                else{
                    break;
                }
            }
            
            if(bill[1]>bill[0]){
                temp=bill[0];
                bill[0]=bill[1];
                bill[1]=temp;
            }
            answer++;
        }
        return answer;
    }
}