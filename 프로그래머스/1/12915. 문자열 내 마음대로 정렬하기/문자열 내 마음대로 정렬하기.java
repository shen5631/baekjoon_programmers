import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {

        char[] arr = new char [strings.length];
        
        for(int i = 0 ; i < strings.length ; i++){
            arr[i] = strings[i].charAt(n);
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                    String temp1 = strings[i];
                    strings[i]=strings[j];
                    strings[j]=temp1;
                }
                else if(arr[i] == arr[j]){
                    String [] temp = {strings[i],strings[j]};
                    Arrays.sort(temp);
                    strings[i]=temp[0];
                    strings[j]=temp[1];
                }
            }
        }
        
        
        String[] answer = strings;
        System.out.println(Arrays.toString(strings));
        
        return answer;
    }
}