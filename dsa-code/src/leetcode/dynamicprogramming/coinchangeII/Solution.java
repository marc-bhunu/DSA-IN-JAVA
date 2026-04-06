package leetcode.dynamicprogramming.coinchangeII;


import java.util.Arrays;

public class Solution {

    public int change(int amount, int[] coins) {
        int n = amount + 1;
        int m = coins.length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 1; j < n; j++) {
            if (j % coins[0] == 0) {
                dp[0][j] = 1;
            }
        }

        System.out.println(Arrays.deepToString(dp));


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (coins[i] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
                }
            }
        }
        return dp[coins.length - 1][amount];
    }
}
