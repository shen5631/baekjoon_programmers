class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0 ; i < my_string.length() ; i++){
            if(my_string.charAt(i)=='1' 
              || my_string.charAt(i)=='2'
              || my_string.charAt(i)=='3'
              || my_string.charAt(i)=='4'
              || my_string.charAt(i)=='5'
              || my_string.charAt(i)=='6'
              || my_string.charAt(i)=='7'
              || my_string.charAt(i)=='8'
              || my_string.charAt(i)=='9')
                answer+=Integer.parseInt(my_string.charAt(i)+"");
        }
        return answer;
    }
}