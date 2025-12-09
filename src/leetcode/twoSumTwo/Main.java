package leetcode.twoSumTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,7,12,15};
        int[] result = solution.twoSum(arr,9);
        System.out.println(Arrays.toString(result));
    }
}
