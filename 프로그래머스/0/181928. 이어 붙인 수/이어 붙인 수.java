class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a [] = new String [num_list.length];
        String b ="";
        String c ="";
        
        
        for(int i = 0 ; i < a.length ; i++){
            a[i] = String.valueOf(num_list[i]);
        }
        for(int i = 0 ; i < a.length ; i++){
           if(num_list[i] % 2 == 0){
               b+=a[i];
           }
            else if (num_list[i] % 2 ==1){
                c+=a[i];
            }
        }
        System.out.print(b);
        return Integer.parseInt(b)+Integer.parseInt(c);
    }
}