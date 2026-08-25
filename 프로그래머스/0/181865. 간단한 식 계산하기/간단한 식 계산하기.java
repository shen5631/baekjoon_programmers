class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String a="";
        String b [] = new String [binomial.length()];
        String c="";
        String d="";
        int j = 0;
        for(int i = 0 ; i < b.length ; i++){
            b[i]=binomial.charAt(i)+"";
        }
        for(int i =0 ; i < binomial.length() ; i++){
            if(b[i].equals("+"))
                a="+";
            else if(b[i].equals("-"))
                a="-";
            else if(b[i].equals("*"))
                a="*";
            else if(b[i].equals("/"))
                a="/";
        }
        for(;j < b.length;j++){
            if(b[j].equals(" "))
                break;
            c+=b[j];
        }
        j+=3;
        for(;j < b.length;j++){
            d+=b[j];
        }
        int a1= answer=Integer.parseInt(c);
        int b1= answer=Integer.parseInt(d);
        switch(a){
            case "+" : answer=(a1+b1);break;
            case "-" : answer=(a1-b1);break;
            case "*" : answer=(a1*b1);break;
            case "/" : answer=(a1/b1);break;
        }
        return answer;
    }
}