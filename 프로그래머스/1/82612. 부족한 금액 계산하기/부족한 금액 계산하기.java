class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;   //부족한 금액
        long coin = 0;      //필요한 금액
        
        for(int i=1; i<=count; i++){
            coin += (price * i);  
        }
        
        return(coin-money <= 0) ? 0 : coin-money;
    }
}