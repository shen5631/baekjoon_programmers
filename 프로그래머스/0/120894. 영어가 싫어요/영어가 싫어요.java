class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String b = "";
        String a [] = new String [numbers.length()];
        String c = "";
        for(int i = 0 ; i < a.length ; i++){
            a[i]=numbers.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length-3 ; i++){
            switch(a[i]){
                case "z" : b+="0";break;
                case "o" : if(a[i+1].equals("n") && a[i+2].equals("e")){b+="1";}break;
                case "t" : if(a[i+1].equals("w")) b+="2"; else if(a[i+1].equals("h")) b+="3"; break;
                case "f" : if(a[i+1].equals("o")) b+="4"; else if(a[i+1].equals("i")) b+="5"; break;
                case "s" : if(a[i+1].equals("i")) b+="6"; else if(a[i+1].equals("e")) b+="7"; break;
                case "e" : if(a[i+1].equals("i")) b+="8"; break;
                case "n" : if(a[i+1].equals("i")) b+="9"; break;
            }
        }
        System.out.print(b);
        c+=a[a.length-3];
        c+=a[a.length-2];
        c+=a[a.length-1];
        switch(c){
                case "one" : b+="1";break;
                case "two" : b+="2";break;
                case "six" : b+="6";break;   
        }
        answer=Long.valueOf(b);
        return answer;
    }
}