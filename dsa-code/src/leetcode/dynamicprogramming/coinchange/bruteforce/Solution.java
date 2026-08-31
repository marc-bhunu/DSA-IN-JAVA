package leetcode.dynamicprogramming.coinchange.bruteforce;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> map = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        int res = dfsHelper(coins, amount);
        return res >= 1e9 ? -1 : res;
    }

    private int dfsHelper(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (map.containsKey(amount)) {
            return map.get(amount);
        }
        int minCoins = (int) 1e9;
        for (int i = 1; i <= coins.length; i++) {
            for (int coin : coins) {
                if (coin <= amount) {
                    minCoins = Math.min(minCoins, 1 + dfsHelper(coins, amount - coin));
                    map.put(amount, minCoins);
                }
            }
        }
        map.put(amount, minCoins);
        return minCoins;
    }
}