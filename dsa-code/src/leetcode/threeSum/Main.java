package leetcode.threeSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);

    }
}
