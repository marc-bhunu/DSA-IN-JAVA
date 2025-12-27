package leetcode.backtracking.combinations;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(1, result, current, n, k);
        return result;
    }

    private void helper(int i, List<List<Integer>> result, List<Integer> current, int n, int k) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (i > n) {
            return;
        }

        current.add(i);
        helper(i + 1, result, current, n, k);
        current.removeLast();
        helper(i + 1, result, current, n, k);

    }
}
