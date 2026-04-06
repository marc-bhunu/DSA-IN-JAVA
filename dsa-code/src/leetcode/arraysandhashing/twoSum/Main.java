package leetcode.arraysandhashing.twoSum;

import java.util.Arrays;

public class Main {
    static void main() {
        Solution solution = new Solution();
        int[] nums = {2, 4, 2};
        int[] result = solution.twoSum(nums, 4);
        System.out.println(Arrays.toString(result));
    }
}
