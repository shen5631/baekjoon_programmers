class Solution {
    public String solution(String my_string) {
        String answer = "";
        String a1 = my_string.toLowerCase();
        System.out.print(a1);
        char a [] = new char[my_string.length()];
        char b;
        for(int i = 0 ; i < a.length ; i++){
            a[i]=a1.charAt(i);
        }
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j<a.length ; j++){
                if((int)a[i] > (int)a[j]){
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            answer+=a[i]+"";
        }
        return answer;
    }
}