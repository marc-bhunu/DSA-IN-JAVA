package leetcode.dynamicprogramming.maximumproductsubarray.bruteforce;

import java.util.Arrays;

public class Solution {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int[] array = Arrays.copyOfRange(nums, i, j);
                System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
                int res = helper(array);
                if (res > max) {
                    max = res;
                }
            }
        }
        return max;
    }

    private int helper(int[] nums) {
        int result = 1;
        for (int num : nums) result = result * num;
        return result;
    }


}
