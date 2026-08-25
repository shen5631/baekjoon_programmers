class Solution {
    public String solution(String letter) {
        String answer = "";
        int cnt=1;
        int j=0;
        String a [] = new String [letter.length()];
        for(int i = 0 ; i < letter.length() ; i++){
            a[i]=letter.charAt(i)+"";
        }
        for(int i = 0 ; i < letter.length() ; i++){
            if(a[i].equals(" "))
            cnt++;
        }
        String b [] = new String [cnt];
        for(int i = 0 ; i < b.length ; i++){
            b[i]="";
        }
        for(int i  = 0 ; i < cnt ; i++){
            for(;j < a.length;++j){
                if(!(a[j].equals(" "))){
                    b[i]+=a[j];
                }
                else{
                    j++;
                    break;
                }
            }    
        }
        for(int i = 0 ; i < b.length ; i++){
           System.out.print(b[i]+" ");
        }
        for(int i = 0 ;i < b.length ; i++){
            switch (b[i]) {
                case ".-":answer += "a";break;
                case "-...":answer += "b";break;
                case "-.-.":answer += "c";break;
                case "-..":answer += "d";break;
                case ".":answer += "e";break;
                case "..-.":answer += "f";break;
                case "--.":answer += "g";break;
                case "....":answer += "h";break;
                case "..":answer += "i";break;
                case ".---":answer += "j";break;
                case "-.-":answer += "k";break;
                case ".-..":answer += "l";break;
                case "--":answer += "m";break;
                case "-.":answer += "n";break;
                case "---":answer += "o";break;
                case ".--.":answer += "p";break;
                case "--.-":answer += "q";break;
                case ".-.":answer += "r";break;
                case "...":answer += "s";break;
                case "-":answer += "t";break;
                case "..-":answer += "u";break;
                case "...-":answer += "v";break;
                case ".--":answer += "w";break;
                case "-..-":answer += "x";break;
                case "-.--":answer += "y";break;
                case "--..":answer += "z";break;
            }
        }
        return answer;
    }
}