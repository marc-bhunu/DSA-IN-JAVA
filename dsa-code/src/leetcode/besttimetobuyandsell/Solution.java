package leetcode.besttimetobuyandsell;

public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = buy + 1;
        int n = prices.length;
        while (sell < n){
            if (prices[buy] < prices[sell]) {
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            }else{
                buy = sell;
            }
            sell++;
        }

        return  maxProfit;
    }

}
