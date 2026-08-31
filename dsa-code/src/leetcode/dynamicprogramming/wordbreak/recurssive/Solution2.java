package leetcode.dynamicprogramming.wordbreak.recurssive;

import java.util.*;

public class Solution2 {
    Set<String> words;
    Map<Integer, Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        words = new HashSet<>(wordDict);
        return dfsHelper(s, 0);
    }

    private boolean dfsHelper(String s, int i) {
        if (map.containsKey(i) ) return map.get(i);
        if(i == s.length()) return true;
        for (int j = i; j < s.length(); j++) {
            if(words.contains(s.substring(i, j + 1)) && dfsHelper(s, j + 1)) {
                map.put(i, true);
                return true;
            }
        }
        map.put(i, false);
        return  false;
    }
}
