import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 1;
        Arrays.sort(array);
        
        for(int i = 0 ; i < array.length-1 ; i++){
            if(array[i] != array [i+1]){
                temp++;
            }
        }

        int a [] = new int [temp];
        int check [] = new int [temp];
        a[a.length-1] = array[array.length-1];
        int cnt = 0;
        for(int i = 0 ; i < array.length-1 ; i++){
            if(array[i] != array [i+1]){
                a[cnt++]=array[i];
            }
        }
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
        
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < a.length ; j++){
                if(array[i] == a[j]){
                    check[j]++;
                }
            }
        }
        
        int check_i = 0;
        int index = 0;
        
        for(int i = 0 ; i < a.length ; i++){
            if(check[i] > check_i){
                check_i = check[i];
                index=i;
            }
        }
        
        int dul = index;
        int cnt1 = 0;
        
        for(int i = 0 ; i < check.length ; i++){
            if(check[dul] == check[i]){
                cnt1++;
            }
        }
        if(cnt1 > 1){
            answer = -1;
        }
        else{
            answer = a[index];  
        }
      
        return answer;
    }
}