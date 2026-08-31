package leetcode.dynamicprogramming.palindromesubstrings.optimized;

public class Solution {
    int result = 0;
    public int countSubstrings(String s) {
        var strLength = s.length();
        if (strLength == 0) return 0;
        if (strLength == 1) return 1;
        for (var i = 0; i < strLength; i++) {
            expandRange(s, i, i);
            expandRange(s, i, i + 1);
        }
        return result;
    }

    private void expandRange(String s, int begin, int end) {
        while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            result++;
            begin--;
            end++;
        }
    }


}
