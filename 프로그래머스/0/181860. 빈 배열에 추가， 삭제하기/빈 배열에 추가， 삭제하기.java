class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        int cnt = 0;
        String a = "";
        int b = 0;
        String aa = "";
        for(int i = 0 ; i < arr.length ; i++){
            if(flag[i]){
                cnt+=arr[i]*2;
            }
            else{
                cnt-=arr[i];
            }
        }
        int[] answer = new int[cnt];
        for(int i = 0 ; i < arr.length ; i++){
            if(flag[i]){
                for(int j = 0 ; j < arr[i]*2 ; j++){
                    a+=String.valueOf(arr[i]);
                }
            }
            else{
                b=a.length();
                for(int j = 0 ; j < b-arr[i] ; j++){
                    aa+=a.charAt(j)+"";
                }
                a=aa;
                aa="";
            }
            System.out.println(a);
        }
        for(int i = 0 ; i < a.length() ; i++){
            answer[i]=Integer.parseInt(a.charAt(i)+"");
        }
        return answer;
    }
}