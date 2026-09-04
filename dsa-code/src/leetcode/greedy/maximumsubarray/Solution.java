package leetcode.greedy.maximumsubarray;


import java.util.Arrays;

public class Solution {
    public int maxSubArray(int[] nums) {
        int n  = nums.length;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int[] subArray = Arrays.copyOfRange(nums, i, j);
                int sumResult = helper(subArray);
                if (sumResult > maxSum) {
                    maxSum = sumResult;
                }
            }
        }
        return maxSum;
    }

    private int helper(int[] nums) {
        int maxSum = 0;
        for (int num: nums) {
            maxSum += num;
        }
        return maxSum;
    }
}
