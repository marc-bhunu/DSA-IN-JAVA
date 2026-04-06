package leetcode.dynamicprogramming.coinchange.topdown;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    private int dfsHelper(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int diff = amount - coin;
            if (diff >= 0) {
                int result = dfsHelper(coins, amount - coin);
                if (result != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + result);
                }
            }
        }

        memo.put(amount, res);
        return res;
    }

    public int coinChange(int[] coins, int amount) {
        int coinAmount = dfsHelper(coins, amount);
        return coinAmount == Integer.MAX_VALUE ? -1 : coinAmount;
    }
}
