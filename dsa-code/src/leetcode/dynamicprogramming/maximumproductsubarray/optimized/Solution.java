package leetcode.dynamicprogramming.maximumproductsubarray.optimized;

public class Solution {

    public int maxProduct(int[] nums) {
        int leftProduct   = 1;
        int rightProduct = 1;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            leftProduct =  leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct =  leftProduct * nums[i];
            rightProduct =  rightProduct * nums[nums.length - 1 - i];

            max = Math.max(max, Math.max(leftProduct, rightProduct));
        }
        return max;
    }
}
