import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int count =0;
        int cnt [] = new int [want.length];
        int sum=0;
        int max=0;
        int zero_cnt=0;
        
        for(int i = 0 ; i < discount.length ; i++){
            for(int j = i ; j < i+10 ;j++){
                for(int k = 0 ; k < want.length ; k++){
                    if(j < discount.length){
                        if(discount[j].equals(want[k])){
                            if(cnt[k]<number[k]){
                                cnt[k]++;
                            }
                        }
                    }
                }
            }
            for(int k = 0 ; k < want.length ;k++){
                sum+=cnt[k];
            }
            
            if(i == 0){
                max=sum;
            }
            
            if(sum > max){
                max=sum;
            }
            
            //System.out.println(Arrays.toString(cnt));
            
            sum=0;
            for(int k = 0 ; k < want.length ;k++){
                cnt[k]=0;
            }
            //System.out.println(answer);
        }
        
        for(int i = 0 ; i < discount.length ; i++){
            for(int j = i ; j < i+10 ;j++){
                for(int k = 0 ; k < want.length ; k++){
                    if(j < discount.length){
                        if(discount[j].equals(want[k])){
                            if(cnt[k]<number[k]){
                                cnt[k]++;
                            }
                        }
                    }
                }
            }
            for(int k = 0 ; k < want.length ;k++){
                sum+=cnt[k];
            }
            
            if(sum == max){
                answer++;
            }
            
            // System.out.println(Arrays.toString(cnt));
            
            sum=0;
            for(int k = 0 ; k < want.length ;k++){
                cnt[k]=0;
            }
            //System.out.println(answer);
        }
        
        for(int i = 0 ; i < discount.length ; i++){
            for(int j = 0 ; j < want.length ; j++){
                if(discount[i].equals(want[j])){
                    count++;
                }
            }
        }
        for(int i = 0 ; i < discount.length ; i++){
            for(int j = 0 ; j < want.length ; j++){
                if(discount[i].equals(want[j])){
                    cnt[j]++;
                }
            }
        }
        
        for(int k = 0 ; k < want.length ;k++){
            if(cnt[k]==0){
                return 0;
            }
        }
        
        if(count == 0){
            return 0;
        }
        else{
            return answer;            
        }
    }
}