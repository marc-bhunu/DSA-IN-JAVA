package leetcode.sliddingwondow.besttimetobuyandsellstock;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = buy + 1;
        int n = prices.length - 1;

        while(sell <= n){
            if (prices[buy]  < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
