import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int mbti [][] = new int[2][4];
        String mbti_str[][] = {{"R","C","J","A"},{"T","F","M","N"}};
        
        for(int i = 0 ; i < survey.length ; i++){
            if(survey[i].charAt(0)=='R' || survey[i].charAt(0)=='T'){
                if(survey[i].charAt(0)=='R'){
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[0][0]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[1][0]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                        
                    }
                }
                else{
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[1][0]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[0][0]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                } 
            }
            if(survey[i].charAt(0)=='C' || survey[i].charAt(0)=='F'){
                if(survey[i].charAt(0)=='C'){
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[0][1]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[1][1]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                }
                else{
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[1][1]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[0][1]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                }
            }
            if(survey[i].charAt(0)=='J' || survey[i].charAt(0)=='M'){
                if(survey[i].charAt(0)=='J'){
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[0][2]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[1][2]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                }
                else{
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[1][2]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[0][2]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                }
            }
            if(survey[i].charAt(0)=='A' || survey[i].charAt(0)=='N'){
                if(survey[i].charAt(0)=='A'){
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[0][3]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[1][3]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                }
                else{
                    if(choices[i] >= 1 && choices[i] < 4){
                        mbti[1][3]+=4-choices[i];
                        System.out.println(survey[i].charAt(0)+" "+(4-choices[i]));
                    }
                    else if(choices[i] > 4){
                        mbti[0][3]+=choices[i]-4;
                        System.out.println(survey[i].charAt(0)+" "+(choices[i]-4));
                    }
                }
            }
        }
        
        System.out.println(Arrays.toString(mbti[0]));
        System.out.println(Arrays.toString(mbti[1]));
        
        for(int i = 0 ; i < 4 ; i++){
            if(mbti[0][i] > mbti[1][i]){
                answer+=mbti_str[0][i];
            }
            else if(mbti[0][i] == mbti[1][i]){
                answer+=mbti_str[0][i];
            }
            else{
                answer+=mbti_str[1][i];
            }
        }
        
        return answer;
    }
}