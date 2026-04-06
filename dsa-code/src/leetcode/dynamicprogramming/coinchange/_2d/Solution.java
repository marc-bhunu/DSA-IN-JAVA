package leetcode.dynamicprogramming.coinchange._2d;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int m = amount + 1;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }

        for (int j = 1; j < m; j++) {
            if (j % coins[0] == 0) {
                dp[0][j] = j;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (coins[i] > j) {
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j - coins[i]]);
                }
            }
            
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[n - 1][amount];
    }
}
