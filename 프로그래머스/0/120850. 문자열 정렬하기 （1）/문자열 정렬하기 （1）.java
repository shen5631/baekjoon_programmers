class Solution {
    public int[] solution(String my_string) {
        int cnt=0;
        int a = 0;
        for(int i = 0 ; i < my_string.length();i++){
            if(!(my_string.charAt(i)!='0' 
              && my_string.charAt(i)!='1'
              && my_string.charAt(i)!='2'
              && my_string.charAt(i)!='3'
              && my_string.charAt(i)!='4'
              && my_string.charAt(i)!='5'
              && my_string.charAt(i)!='6'
              && my_string.charAt(i)!='7'
              && my_string.charAt(i)!='8'
              && my_string.charAt(i)!='9'))
            cnt++;
        }
        String answer [] =new String [cnt];
        for(int i = 0 ; i < my_string.length();i++){
            if(!(my_string.charAt(i)!='0' 
              && my_string.charAt(i)!='1'
              && my_string.charAt(i)!='2'
              && my_string.charAt(i)!='3'
              && my_string.charAt(i)!='4'
              && my_string.charAt(i)!='5'
              && my_string.charAt(i)!='6'
              && my_string.charAt(i)!='7'
              && my_string.charAt(i)!='8'
              && my_string.charAt(i)!='9')){
            answer[a]=my_string.charAt(i)+"";
            a++;
            }
        }
        int a1 [] = new int[cnt];
        for(int i = 0 ; i < answer.length ; i++)
            a1[i]=Integer.parseInt(answer[i]);
        
        int b = 0 ;
        for(int i = 0 ; i < a1.length ; i++){
            for(int j = i+1 ; j < a1.length ; j++){
                if(a1[i] > a1[j]){
                    b=a1[i];
                    a1[i]=a1[j];
                    a1[j]=b;
                }
            }
        }
        return a1;
    }
}