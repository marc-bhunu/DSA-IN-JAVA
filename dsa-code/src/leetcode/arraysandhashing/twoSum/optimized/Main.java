package leetcode.arraysandhashing.twoSum.optimized;

import java.util.Arrays;

public class Main {
    static void main() {
        Solution solution = new Solution();
        int[] nums = {4,1,8};
        int[] result = solution.twoSum(nums,12);
        System.out.println(Arrays.toString(result));
    }
}
