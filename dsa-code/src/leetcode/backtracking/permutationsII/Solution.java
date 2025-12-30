package leetcode.backtracking.permutationsII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        boolean[] visited = new boolean[nums.length];
        helper(result, visited, new ArrayList<>(), nums);
        return new ArrayList<>(result);
    }

    private void helper(Set<List<Integer>> result, boolean[] visited, List<Integer> current, int[] nums) {
        if (nums.length == current.size()) {
            List<Integer> currPem = new ArrayList<>(current);
            result.add(currPem);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(nums[i]);
                helper(result, visited, current, nums);
                current.removeLast();
                visited[i] = false;
            }
        }

    }
}
