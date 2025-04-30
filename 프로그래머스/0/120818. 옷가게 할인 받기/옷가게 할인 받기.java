class Solution {
    public int solution(int price) {
        double a = price-price*0.05;
        double b = price-price*0.1;
        double c = price-price*0.2;
        if(price>=500000)
        price = (int)c;
        else if(price>=300000)
        price = (int)b;
        else if(price>=100000)
        price = (int)a;
            
        int answer = price;
        return answer;
    }
}