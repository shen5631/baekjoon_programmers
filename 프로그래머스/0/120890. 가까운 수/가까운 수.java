import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int cnt=1;
        int a [] = new int [array.length];
        for(int i = 0 ; i < a.length;i++){
            a[i]=array[i];
        }
        for(int i = 0 ; i < array.length ; i++){
            array[i]=array[i]-n;
        }
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]<0){
                array[i]*=-1;
            }
        }
        Arrays.sort(array);
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]==n-array[0]){
                cnt--;
                break;
            }
        }
        if(cnt==0)
            answer=n-array[0];
        else
            answer=n+array[0];
        return answer;
    }
}