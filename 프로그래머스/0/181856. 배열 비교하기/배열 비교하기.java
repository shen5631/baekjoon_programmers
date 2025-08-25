class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0 ; i < arr1.length ; i++){
            cnt1+=arr1[i];
        }
        for(int i = 0 ; i < arr2.length ; i++){
            cnt2+=arr2[i];
        }
        if(arr1.length > arr2.length){
            answer=1;
        }
        else if(arr1.length < arr2.length){
            answer=-1;
        }
        else if(cnt1>cnt2)
            answer=1;
        else if(cnt2>cnt1)
            answer=-1;
        
        
        return answer;
    }
}