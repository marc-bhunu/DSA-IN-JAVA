package leetcode.dynamicprogramming.fibonacci;

import java.util.Arrays;

public class Bottom {
    static int count = 0;

    static int fib(int n) {
        count++;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    static void main() {
        System.out.println(fib(5));
    }
}
