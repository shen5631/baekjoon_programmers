class Solution {
    public int[] solution(int n, int m) {
        int rn = n;
        int rm =m;
        int[] answer = new int[2];
        int r = n%m;
        while(true){
            r=n%m;
            if(r==0){
                break;
            }
            n=m;
            m=r;
        }
        System.out.println(m);
        answer[0]=m;
        
        answer[1]=rn*rm/m;
        
        
        return answer;
    }
}