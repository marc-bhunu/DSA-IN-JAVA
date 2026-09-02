package leetcode.dynamicprogramming.longestincreasingsubsequence;

import java.util.Arrays;

public class Solution {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

        }
        return max(dp);
    }

    private int max(int[] nums) {
        int maxValue = 0;
        for(int num : nums){
            maxValue = Math.max(maxValue, num);
        }
        return maxValue;
    };



}
