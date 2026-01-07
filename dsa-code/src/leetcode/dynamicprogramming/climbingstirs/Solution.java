package leetcode.dynamicprogramming.climbingstirs;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        return dfs(0, n);
    }

    private int dfs(int i, int n) {
        if (i >= n) {
            return i == n ? 1 : 0;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        int stirCount = dfs(i + 1, n) + dfs(i + 2, n);

        memo.put(i, stirCount);

        return stirCount;
    }
}
