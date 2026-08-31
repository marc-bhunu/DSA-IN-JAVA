package leetcode.dynamicprogramming.houserobber;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int prev = nums[0];
        int prev1 = Math.max(prev, nums[1]);
        for(int i = 2; i < n; i++) {
            int curr = Math.max(prev1, prev + nums[i]);
            prev = prev1;
            prev1 = curr;
        }
        return  prev1;
    }
}