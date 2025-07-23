class Solution {
    public String solution(String myString) {
        String answer = "";
        String b = myString.toLowerCase();
        String a [] = new String [myString.length()];
        for(int i = 0 ; i < myString.length() ; i++){
            a[i]=b.charAt(i)+"";
        }
        for(int i = 0; i < myString.length() ; i++){
            if(a[i].equals("a"))
                a[i]="A";
        }
        for(int i = 0 ; i < a.length; i++){
            answer+=a[i]+"";
        }
        return answer;
    }
}