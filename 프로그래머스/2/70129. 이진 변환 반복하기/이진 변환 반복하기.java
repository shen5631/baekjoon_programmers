class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String new_str="";
        int two=0;
        int cnt=0;
        
        while(cnt++<5){
            new_str="";
            System.out.println(new_str);
            for(int i = 0 ; i < s.length() ;i++){
                if(s.charAt(i) == '0'){
                    answer[1]++;
                }
                else{
                    new_str+="1";
                }
            }
            
            two = new_str.length();
            System.out.println(two);
            if(two == 1){
                break;
            }
            answer[0]++;
            s=Integer.toBinaryString(two);
            System.out.println(s);
        }
        answer[0]++;
        return answer;
    }
}