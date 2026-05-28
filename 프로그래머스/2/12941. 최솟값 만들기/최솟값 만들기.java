import java.util.*;
class Solution{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int temp;
        Arrays.sort(A);
        
        
        for(int i = 0 ; i<A.length ; i++){
            for(int j = i+1 ; j<A.length ; j++){
                if(B[i]<B[j]){
                    temp=B[i];
                    B[i]=B[j];
                    B[j]=temp;
                }
            }
        }

        for(int i = 0 ; i < A.length ; i++){
            answer+=A[i]*B[i];
        }

        return answer;
    }
}