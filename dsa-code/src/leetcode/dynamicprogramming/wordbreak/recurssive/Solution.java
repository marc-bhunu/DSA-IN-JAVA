package leetcode.dynamicprogramming.wordbreak.recurssive;

import java.util.HashSet;
import java.util.List;

public class Solution {
    HashSet<String> words;

    public boolean wordBreak(String s, List<String> wordDict) {
        words = new HashSet<>(wordDict);
        return dfsHelper(s, 0);
    }

    private boolean dfsHelper(String s, int i) {
        if (i == s.length()) return true;
        for (int j = i; j < s.length(); j++) {
            if (words.contains(s.substring(i, j + 1))) {
                if (dfsHelper(s, j + 1)) {
                    return true;
                }
            }
        }
        return false;
    }


}
