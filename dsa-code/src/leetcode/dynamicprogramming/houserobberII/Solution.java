package leetcode.dynamicprogramming.houserobberII;



public class Solution {

    public int rob(int[] nums) {
        int n = nums.length - 1;
        int [] robFirstHouse = new int[n];
        int [] robLastHouse =  new int[n];
        for (int i = 0; i < n; i++) {
            robFirstHouse[i]  = nums[i];
            robLastHouse[i] =   nums[i + 1];
        }
        int robFirstHouseResult = robHelper(robFirstHouse);
        int robLastHouseResult =  robHelper(robLastHouse);
        return Math.max(robFirstHouseResult, robLastHouseResult);
    }

    public int robHelper(int[] nums) {
      int n = nums.length;
      if (n == 0) return 0;
      if (n == 1) return nums[0];
      int prev = nums[0];
      int prev1 = Math.max(prev,  nums[1]);
      for (int i = 2; i < n; i++) {
          int cur = Math.max(prev + nums[i], prev1);
          prev = prev1;
          prev1 = cur;
      }
      return  prev1;
    }
}
