class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while(i != n){
            answer++;
            String s = String.valueOf(answer);
            if(answer % 3 == 0 || s.indexOf("3") != -1 ){
                System.out.println('!');
                while(true){
                    if(answer % 3 == 0 || s.indexOf("3") != -1 ){
                        answer++;
                        System.out.println('?');
                        s = String.valueOf(answer);
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println(i+" "+answer);
            i++;
        }
        return answer;
    }
}