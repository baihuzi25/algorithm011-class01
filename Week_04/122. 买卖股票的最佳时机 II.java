//贪心算法，只要当前价格高于前一天买进价格，就锁定利润
class Solution {
    public int maxProfit(int[] prices) {
        int  maxprofit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                maxprofit += (prices[i] - prices[i-1]);
            }
           
        }
        return maxprofit;
        
    }
}