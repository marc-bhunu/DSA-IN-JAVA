package leetcode.dynamicprogramming.houserobberII;

public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length ==  1) return nums[0];
        int[] robFirstHouse = new int[nums.length - 1];
        int[] robLastHouse = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            robFirstHouse[i]  = nums[i];
            robLastHouse[i] = nums[i + 1];
        }
        int resultWhenWeRobFirstHouse = robHelper(robFirstHouse);
        int resultWhenWeRobLastHouse = robHelper(robLastHouse);
        return Math.max(resultWhenWeRobFirstHouse, resultWhenWeRobLastHouse);
    }

    public int robHelper(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length ==  1) return nums[0];
        int prev = nums[0];
        int prev1 = Math.max(prev, nums[1]);
        for (int i = 2; i < nums.length; i++){
            int currentMax = Math.max(nums[i] + prev, prev1);
            prev = prev1;
            prev1 = currentMax;
        }
        return  prev1;
    };
}
