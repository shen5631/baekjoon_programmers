import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String bb [] = {"aya","ye", "woo", "ma"};
        int a [] = new int[5];
        int check [][] = new int[babbling.length][4];
        for(int k = 0 ; k < 7 ; k++){
            for(int i = 0 ; i < babbling.length ; i++){
                for(int j = 0 ; j < bb.length ; j++){
                    if(babbling[i].startsWith(bb[j])){
                        System.out.println(babbling[i]+" "+bb[j]);
                        if(babbling[i].length()-bb[j].length() != 1 && check[i][j] ==0){
                            System.out.print(babbling[i] +" "+bb[j]+" "+i+" ");
                            babbling[i] = babbling[i].replaceFirst(bb[j],"");
                            System.out.println(babbling[i]);
                            check[i][j]++;
                        }
                    }
                }
            }
        }
        
        System.out.println("-----------------------------------------------------------");
        for(int i = 0 ; i < babbling.length ; i++){
            for(int j = 0 ; j < bb.length ; j++){
                if(babbling[i].endsWith(bb[j])&& check[i][j] ==0){
                    System.out.println(babbling[i] +" "+bb[j]+" "+i);
                    babbling[i] = babbling[i].replaceFirst(bb[j],"");
                }
            }
        }
        
        System.out.println(Arrays.toString(babbling));
        
        for(int i = 0 ; i < babbling.length ; i++){
            if(babbling[i].equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}   