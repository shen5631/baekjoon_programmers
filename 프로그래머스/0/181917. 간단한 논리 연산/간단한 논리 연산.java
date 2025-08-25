class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean x12 = true;
        boolean x34 = true;
        if(x1==false && x2 == false){
            x12=false;
        }
        if(x3 == false && x4 == false){
            x34=false;
        }
        if(x12==true && x34 == true){
            answer = true;
        }
        
        return answer;
    }
}