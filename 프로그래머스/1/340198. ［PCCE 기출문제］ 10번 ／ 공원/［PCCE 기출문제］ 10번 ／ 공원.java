import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int cnt=0;
        
        Integer arr [] = new Integer [mats.length];
        
        int index=0;
        
        
        for(int i = 0 ; i < mats.length ; i++){
            arr[i]=mats[i];
        }
        
        Arrays.sort(arr, Comparator.reverseOrder());
        
        for(int i = 0 ; i < mats.length ; i++){
            mats[i]=arr[i];
        }
        
        for(int i = 0 ; i < park.length ; i++){
            for(int j = 0 ; j < park[i].length ; j++){
                for(int k = 0 ; k < mats.length ; k++){
                    for(int i1 = 0 ; i1 < mats[k] ; i1++){
                        for(int j1 = 0 ; j1 < mats[k] ; j1++){
                            if(i+i1 < park.length && j+j1 < park[i].length){
                                if(park[i+i1][j+j1].equals("-1")){
                                    cnt++;
                                }
                            }
                        }
                    }
                    //System.out.println(cnt);
                    if(cnt==mats[k]*mats[k]){
                        index++;
                        cnt=0;
                    }
                    else{
                        cnt=0;
                    }
                }
            }
        }
        
        int arr1[]=new int[index];
        index=0;
        cnt=0;
        
        for(int i = 0 ; i < park.length ; i++){
            for(int j = 0 ; j < park[i].length ; j++){
                for(int k = 0 ; k < mats.length ; k++){
                    for(int i1 = 0 ; i1 < mats[k] ; i1++){
                        for(int j1 = 0 ; j1 < mats[k] ; j1++){
                            if(i+i1 < park.length && j+j1 < park[i].length){
                                if(park[i+i1][j+j1].equals("-1")){
                                    cnt++;
                                }
                            }
                        }
                    }
                    //System.out.println(cnt);
                    if(cnt==mats[k]*mats[k]){
                        arr1[index++]=mats[k];
                        cnt=0;
                    }
                    else{
                        cnt=0;
                    }
                }
            }
        }
        
        Arrays.sort(arr1);
        
        System.out.println(Arrays.toString(arr1));
        
        if(arr1.length > 0){
            answer=arr1[arr1.length-1];
        }
        
        return answer;
    }
}