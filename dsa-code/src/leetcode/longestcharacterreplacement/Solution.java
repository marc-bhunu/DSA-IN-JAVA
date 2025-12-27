package leetcode.longestcharacterreplacement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0, maxFrequency = 0, n = s.length(), left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            int currentWindowSize = (right - left) + 1;
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(s.charAt(right)));
            if (currentWindowSize - maxFrequency > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, (right - left) + 1);
        }
        return maxLength;
    }
}
