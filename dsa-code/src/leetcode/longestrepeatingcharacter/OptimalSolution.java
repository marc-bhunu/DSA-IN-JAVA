package leetcode.longestrepeatingcharacter;

import java.util.HashSet;
import java.util.Set;

public class OptimalSolution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> seen = new HashSet<Character>();
        int left = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, (right - left) + 1);
        }

        return maxLength;
    }
}
