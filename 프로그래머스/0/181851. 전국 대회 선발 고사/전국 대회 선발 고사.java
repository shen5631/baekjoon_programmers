import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int cnt = 0;
        int temp =0;
        for(int i = 0 ; i < attendance.length ; i++){
            if(attendance[i]){
                cnt++;
            }
        }
        
        
        int a [] = new int[cnt];
        int index [] = new int[cnt];
        cnt=0;
        
        for(int i = 0 ; i < attendance.length ; i++){
            if(attendance[i]){
                a[cnt] = rank[i];
                cnt++;
            }
        }
        
        cnt = 0;
        
        for(int i = 0 ; i < rank.length ; i++){
            for(int j = 0 ; j < a.length ; j++){
                if(rank[i]==a[j]){
                    index[cnt++]=i;
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(a));
        
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = i+1 ; j < a.length; j++){
                if(a[j] < a[i]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                    temp = index[i];
                    index[i] = index[j];
                    index[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(a));

        answer=index[0]*10000+index[1]*100+index[2];
        
        
        return answer;
    }
}