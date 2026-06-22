class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();//1단계
        new_id = new_id.replaceAll("([^a-z0-9-_.])","");//2단계
        new_id = new_id.replaceAll("((\\.{2,}))",".");//3단계
        new_id = new_id.replaceAll("(^(\\.+))","");//4단계
        new_id = new_id.replaceAll("((\\.+)$)","");//4단계
        if(new_id.equals("")){          //5단계
            new_id="a";
        }
        if(new_id.length() > 15){       //6단계
            new_id=new_id.substring(0,15);
        }
        new_id = new_id.replaceAll("((\\.+)$)","");//6단계
        
        if(new_id.length() <= 2){                   //7단계
            String str = new_id.charAt(new_id.length()-1)+"";
            for(int i = new_id.length()-1 ; i < 2 ; i++){
                new_id+=str;
            }
        }
        
        System.out.println(new_id);
        
        answer=new_id;
        
        return answer;
    }
}