package leetcode.sliddingwondow.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int n = s.length();
        for (int right = 0; right < n; right++) {
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            int currentLength = (right - left) + 1;
            maxLength = Math.max(maxLength, currentLength);
            seen.add(s.charAt(right));
        }
        return maxLength;
    }
}
