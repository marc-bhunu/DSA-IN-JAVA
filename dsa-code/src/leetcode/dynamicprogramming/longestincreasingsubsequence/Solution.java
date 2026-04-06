package leetcode.dynamicprogramming.longestincreasingsubsequence;

import java.util.Arrays;

public class Solution {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return currentMax(dp);
    }

    private int currentMax(int[] n) {
        int max = n[0];
        for (int num : n) max = Math.max(max, num);
        return max;
    }

}
