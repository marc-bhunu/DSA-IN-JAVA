package leetcode.dynamicprogramming.maximumproductsubarray.bruteforce;

import java.util.Arrays;

public class Solution {

    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int[] subArray = Arrays.copyOfRange(nums, i, j);
                int total = helper(subArray);
                res = Math.max(total, res);
            }
        }
        return res;
    }

    private int helper(int[] numbers) {
        int res = 1;
        for (int num : numbers) res *= num;
        return res;
    }
}
