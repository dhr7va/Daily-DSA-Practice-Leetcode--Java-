class Solution {
    public int maxProfit(int[] prices) {
        int net_profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1])
                net_profit += (prices[i]-prices[i-1]);
        }
        return net_profit;
    }
}
