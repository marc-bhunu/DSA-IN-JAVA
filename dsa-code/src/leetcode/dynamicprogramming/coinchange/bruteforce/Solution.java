package leetcode.dynamicprogramming.coinchange.bruteforce;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int dfsHelper(int[] coins, int amount){
        if (amount == 0) return 0;
        int res = (int) 10e9;
        for (int coin: coins){
            if (amount - coin >=0) {
                res = Math.min(res, 1 + dfsHelper(coins,amount - coin));
            }
        }
        return  res;
    }
    public int coinChange(int[] coins, int amount){
        int minCoins = dfsHelper(coins, amount);
        return minCoins >= 10e9 ? -1 : minCoins;
    }
}
