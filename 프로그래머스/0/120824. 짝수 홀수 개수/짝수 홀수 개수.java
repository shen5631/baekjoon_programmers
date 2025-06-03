class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int a[] ={0,0};
        
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i]%2==0)
                a[0]+=1;
            else
                a[1]+=1;
        }
        return a;
    }
}