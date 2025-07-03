class Solution {
    public int solution(int order) {
        int answer = 0;
        String b = String.valueOf(order);
        String a []  = new String [b.length()];
        for(int i = 0 ; i < a.length ; i++){
            a[i]=b.charAt(i)+"";
        }
        for(int i = 0 ; i < a.length ; i++ ){
            if(a[i].equals("3") || a[i].equals("6") || a[i].equals("9"))
                answer++;
        }
        return answer;
    }
}