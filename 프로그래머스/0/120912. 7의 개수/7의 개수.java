class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt=0;
        int index [] = new int [array.length];
        String a [] = new String [array.length];
        String b = "";
        for(int i = 0 ; i < a.length ; i++){
            a[i]=String.valueOf(array[i]);
        }
        for(int i = 0 ; i < a.length ; i++){
            cnt+=a[i].length();
        }
        for(int i = 0 ; i < a.length ; i++){
            b+=a[i];
        }
        String c [] = new String [cnt];
        for(int i = 0 ; i < b.length() ; i++){
            c[i]=b.charAt(i)+"";
        }
        for(int i = 0 ; i < c.length ; i++){
            if(c[i].equals("7")){
                answer++;
            }
        }
        return answer;
    }
}