class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int [2];
        
        int x = 0;
        int y = 0;
        
        for(int i = 0 ; i < park.length ; i++){
            for(int j = 0; j < park[i].length() ; j++){
                if(park[i].charAt(j) == 'S'){
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        
        int xy=0;
        boolean check = true;
        for(int i = 0 ; i < routes.length ; i++){
            if(routes[i].charAt(0)=='E'){
                xy=1;
            }
            else if(routes[i].charAt(0)=='W'){
                xy=2;
            }
            else if(routes[i].charAt(0)=='S'){
                xy=3;
            }
            else if(routes[i].charAt(0)=='N'){
                xy=4;
            }
            int ex = Integer.parseInt(routes[i].charAt(2)+"");
            
            if(xy==1){
                if(y+ex < park[0].length()){
                    for(int j = 1 ; j <= ex ; j++){
                        if(park[x].charAt(y+j) == 'X'){
                            check=false;
                            break;
                        }   
                    }
                    if(check){
                        y+=ex;
                    }
                    check=true;
                }
            }
            if(xy==2){
                if(y-ex >= 0){
                    for(int j = 1 ; j <= ex ; j++){
                        if(park[x].charAt(y-j) == 'X'){
                            check=false;
                            break;
                        }   
                    }
                    if(check){
                        y-=ex;
                    }
                    check=true;
                }
            }
            if(xy==3){
                if(x+ex < park.length){
                    
                    for(int j = 1 ; j <= ex ; j++){
                        if(park[x+j].charAt(y) == 'X'){
                            check=false;
                            break;
                        }   
                    }
                    
                    if(check){
                        //System.out.println(ex);
                        x+=ex;
                    }
                    check=true;
                }
            }
            if(xy==4){
                if(x-ex >= 0){
                    for(int j = 1 ; j <= ex ; j++){
                        if(park[x-j].charAt(y) == 'X'){
                            check=false;
                            break;
                        }   
                    }
                    if(check){
                        x-=ex;
                    }
                    check=true;
                }
            }
            //System.out.println(x+" "+y+" "+xy);
        }
        
        //System.out.println(x+" "+y);
        
        answer[0]=x;
        answer[1]=y;
        
        return answer;
    }
}