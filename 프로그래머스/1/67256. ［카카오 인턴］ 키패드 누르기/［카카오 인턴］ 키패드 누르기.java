class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int check;
        int L_tumb [] = {3,0};
        int R_tumb [] = {3,2};
        int sum [] = new int[2];
        int D=0;
        int R=0;
        
        for(int i = 0 ; i < numbers.length ; i++){
            check = numbers[i];
            if(check == 1 || check == 4 || check == 7){
                answer+="L";
                L_tumb[0]= check / 3;
                L_tumb[1] = 0;
            }
            else if(check == 3 || check == 6 || check == 9){
                answer+="R";
                R_tumb[0]= check/3-1;
                R_tumb[1] = 2;
            }
            else{
                if(check == 0){
                    D=3;
                    R=1;
                }
                else{
                    D = check / 3 ;
                    R = 1;
                }
                
                
                sum[0] = Math.abs(D-L_tumb[0])+Math.abs(R - L_tumb[1]);
                sum[1] = Math.abs(D-R_tumb[0])+Math.abs(R - R_tumb[1]);
                if(sum[0] > sum[1]){
                    answer+="R";
                    if(check == 0){
                        R_tumb[0]=3;
                        R_tumb[1]=1;
                    }
                    else{
                        R_tumb[0]= check / 3;
                        R_tumb[1] = check%3-1;
                    }
                    
                }
                else if(sum[0] < sum[1]){
                    answer+="L";
                    if(check == 0){
                        L_tumb[0]=3;
                        L_tumb[1]=1;
                    }
                    else{
                        
                        L_tumb[0]=check / 3 ;
                        L_tumb[1] = check%3-1;
                    }
                    
                }
                else{
                    if(hand.equals("right")){
                        answer+="R";
                        if(check == 0){
                            R_tumb[0]=3;
                            R_tumb[1]=1;
                        }
                        else{
                            R_tumb[0]=check / 3;
                            R_tumb[1] = check%3-1;                            
                        }
                    }
                    else{
                        answer+="L";
                        if(check == 0){
                            L_tumb[0]=3;
                            L_tumb[1]=1;
                        }
                        else{
                            L_tumb[0]= check / 3;
                            L_tumb[1] = check%3-1;
                        }
                    }
                }
                
                
            }
            System.out.println(check+"좌표 : "+D+","+R);
            System.out.println("왼쪽 좌표 : "+L_tumb[0]+","+L_tumb[1]+" 오른쪽 좌표 "+R_tumb[0]+","+R_tumb[1]);
            System.out.println("합 : "+sum[0]+" "+sum[1]);
            System.out.println();
        }
        return answer;
    }
}