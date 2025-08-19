class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int a = num_list.length - n ;
        int [] b = new int [a];
        
        
        int b1 = 0;
        
        int a2 = num_list.length-a;
        
        int b2 [] = new int [a2];
        
        int c [] = new int [num_list.length];
        
        int c1 = 0;
        for(int i=n ; i < num_list.length ; i++){
            b [b1++] = num_list[i];
        }
        for(int i = 0 ; i < a2 ; i++){
            b2[i] = num_list[i];
        }
        
        for(int i=0 ; i < a ; i++){
           c[c1++]=b [i];
        }
        
        for(int i = 0 ; i < a2 ; i++){
            c[c1++]=b2[i];
        }

        return c;
    }
}