package leetcode.dynamicprogramming.longestpalindromesubstring;

public class Solution {
    int resultStart = 0;
    int resultLength = 0;

    public String longestPalindrome(String str) {
        if (str.length() < 2) return str;
        for (int i = 0; i < str.length() - 1; i++) {
            expandRange(str, i, i);
            expandRange(str, i, i + 1);
        }
        return str.substring(resultStart, resultStart + resultLength);

    }

    private void expandRange(String str, int begin, int end) {
        while(begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }

        if (resultLength < end  - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - resultStart;
        }
    }


}
