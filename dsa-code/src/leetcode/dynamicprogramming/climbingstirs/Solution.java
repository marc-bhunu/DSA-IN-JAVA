package leetcode.dynamicprogramming.climbingstirs;

import java.util.Arrays;

class Solution {
//    public int climbStairs(int n) {
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        System.out.println(Arrays.toString(dp));
//        return dp[n];
//    }

    public int climbStairs(int n ){
        int oneStep  =  1;
        int twoSteps =  1;
        for(int i = 2; i <= n; i++){
            int curr = oneStep + twoSteps;
            twoSteps = oneStep;
            oneStep = curr;
        }
        return oneStep;
    }
}
