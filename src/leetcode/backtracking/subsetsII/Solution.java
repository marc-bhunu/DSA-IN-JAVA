package leetcode.backtracking.subsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(0, nums, result, current);
        return result;
    }

    private void helper(int index, int[] nums, List<List<Integer>> result, List<Integer> current){
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        helper(index + 1, nums, result, current);
        current.removeLast();

        while (index + 1 < nums.length && nums[index] == nums[index + 1]){
            index++;
        }
        helper(index + 1, nums, result, current);
    }
}
