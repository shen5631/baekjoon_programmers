class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int cnt=0;
        String name1 [] = new String [gifts.length];
        String name2 [] = new String [gifts.length];
        int name1i [] = new int [gifts.length];
        int name2i [] = new int [gifts.length];
        
        int prename [] = new int [friends.length];
        
        int pre [][] = new int [friends.length][friends.length];
        
        int check [][] = new int [friends.length][friends.length];
        
        int end [] = new int [friends.length];
        
        //null값 제거
        
        for(int i = 0 ; i < name1.length ; i++){
            name1[i]="";
        }
        for(int i = 0 ; i < name1.length ; i++){
            name2[i]="";
        }
        
        //이름 나누기
        
        for(int i = 0 ; i < gifts.length ; i++){
            for(int j = 0 ; j < gifts[i].length() ; j++){
                if((gifts[i].charAt(j)+"").equals(" ")){
                    cnt++;
                }
                if(cnt == 0 ){
                    name1[i]+=gifts[i].charAt(j)+"";
                }
                else if(cnt == 1 && !((gifts[i].charAt(j)+"").equals(" "))){
                    name2[i]+=gifts[i].charAt(j)+"";
                }
            }
            cnt=0;
        }
        
        //선물거래 표 이름 정하기
        
        for(int i = 0 ; i < name1.length ; i++){
            for(int j = 0 ; j < friends.length ; j++){
                if(friends[j].equals(name1[i])){
                    name1i[i]=j;
                }
            }
        }
        
        for(int i = 0 ; i < name1.length ; i++){
            for(int j = 0 ; j < friends.length ; j++){
                if(friends[j].equals(name2[i])){
                    name2i[i]=j;
                }
            }
        }
        
        for(int i = 0 ; i < name1.length ; i++){
            pre[name1i[i]][name2i[i]]++;
        }
        
        for(int i = 0 ; i < pre.length ; i++){
            pre[i][i]=-1;
        }
        
        // 선물지수 구하기
        
        for(int i = 0 ; i < name1.length ; i++){
            for(int j = 0 ; j < friends.length ; j++){
                if(friends[j].equals(name1[i])){
                    prename[j]++;
                }
                if(friends[j].equals(name2[i])){
                    prename[j]--;
                }
            }
        }
        
        //최종계산
        
        for(int i = 0 ; i < pre.length ; i++){
            for(int j = 0 ; j < pre.length ; j++){
                if(i==j){
                    
                }
                else if(pre[i][j]>pre[j][i] && check[i][j] == 0 && check[j][i] == 0){
                    end[i]++;
                    check[i][j]++;
                }
                else if(pre[i][j]==pre[j][i] && check[i][j] == 0 && check[j][i] == 0){
                    if(prename[i]>prename[j]){
                        end[i]++;
                        check[i][j]++;
                        
                    }
                    else if(prename[i]==prename[j]){
                        
                    }
                    else{
                        end[j]++;
                        check[i][j]++;
                    }
                }
                else if(pre[i][j]<pre[j][i] && check[i][j] == 0 && check[j][i] == 0){
                    end[j]++;
                    check[i][j]++;
                }
            }
        }
        
        //최종계산 계산
        
        // for(int i = 0 ; i < end.length ; i++){
        //     end[i]=end[i]/2;
        //     if(end[i]==1){
        //         end[i]=0;
        //     }
        // }
        
        //최종값 정렬
        
        for(int i = 0 ; i < end.length ; i++){
            if(answer<end[i]){
                answer=end[i];
            }
        }
        
        //이름값 출력
        
        // for(int i = 0 ; i < name1.length ; i++){
        //     System.out.print(name1i[i]+" ");
        // }
        // System.out.println();
        // for(int i = 0 ; i < name1.length ; i++){
        //     System.out.print(name2i[i]+" ");
        // }
        
        //선물수 출력
        
        // for(int i = 0 ; i < pre.length ; i++){
        //     for(int j = 0 ; j < pre.length ; j++){
        //         System.out.print(pre[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        //선물지수 출력
        
        // for(int i = 0 ; i < prename.length ; i++){
        //     System.out.println(prename[i]);
        // }
        
        //최종계산 출력
        
        // for(int i = 0 ; i < end.length ; i++){
        //     System.out.println(end[i]);
        // }
        
        
        return answer;
    }
}