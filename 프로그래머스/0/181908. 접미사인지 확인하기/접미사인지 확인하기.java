class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int check = 0;
        String a [] =new String [my_string.length()];
        for(int i = 0 ; i < a.length ; i ++){
            a[i]="";
        }
        for(int i = a.length-1 ; i >= 0 ; i--){
            for(int k = check ; k < a.length ; k++){
                a[i]+=my_string.charAt(k)+"";
            }
            System.out.println(a[i]);
            check++;
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i].equals(is_suffix)){
                answer=1;
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
        return answer;
    }
}