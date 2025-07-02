class Solution {
    public String solution(int age) {
        String answer = "";
        String b = String.valueOf(age);
        String c [] = new String[b.length()];
        for(int i = 0 ; i < b.length() ; i++){
            c[i]=b.charAt(i)+"";
        }
        for(int i = 0 ; i < c.length ; i++){
            char a = 97;
            for(int j = 0 ; j < 10 ; j++){
                int d = Integer.parseInt(c[i]);
                if(d==(int)a-97){
                    answer+=a+"";
                    break;
                }
                a++;
            }
        }
        return answer;
    }
}