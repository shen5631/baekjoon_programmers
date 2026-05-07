class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
        int [] n_list = new int[numlist.length];
        
        int temp = 0;
        
        for(int i = 0 ; i < n_list.length ; i++){
            n_list[i] = Math.abs(numlist[i]-n);
        }
        
        for(int i = 0 ; i < numlist.length ; i++){
            for(int j = i+1 ; j < numlist.length ; j++){
                if(n_list[i] > n_list[j]){
                    temp = n_list[i];
                    n_list[i] = n_list[j];
                    n_list[j] = temp;
                    
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                    
                }
            }
        }
        
        for(int i = 0 ; i < numlist.length ; i++){
            for(int j = i+1 ; j < numlist.length ; j++){
                if(n_list[i] == n_list[j]){
                    if(numlist[i]<numlist[j]){
                        temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }
        }
        
        
        return numlist;
    }
}