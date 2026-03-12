class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int cnt=0;
        int b = 1;
        
        if(n%w != 0){
            cnt++;
        }
        
        int check_i = 0;
        int check_j = 0;
        int a [][] =new int[n/w + cnt][w];
        cnt=1;

        for(int i = a.length-1 ; i >= 0 ; i--){
            if(b%2==1){
                for(int j = 0 ; j < a[0].length ; j++){
                    if(cnt <= n){
                        a[i][j]=cnt++;                    
                    }
                    else{
                        a[i][j]=-1;
                    }

                }
            }
            else{
                for(int j = a[0].length-1 ; j >= 0 ; j--){
                    if(cnt <= n){
                        a[i][j]=cnt++;                    
                    }
                    else{
                        a[i][j]=-1;
                    }

                }
            }
            b++;

        }
        
        // for(int i = 0 ; i < a.length ; i++){
        //     for(int j = 0 ; j < a[0].length ; j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int i = a.length-1 ; i >= 0 ; i--){
            for(int j = 0 ; j < a[0].length ; j++){
                if(a[i][j]==num){
                    check_i = i;
                    check_j = j;
                }
            }
        }
        
        for(int i = check_i ; i >= 0 ; i--){
            if(a[i][check_j] != -1 ){
                answer++;
            }
        }

        
        
        return answer;
    }
}