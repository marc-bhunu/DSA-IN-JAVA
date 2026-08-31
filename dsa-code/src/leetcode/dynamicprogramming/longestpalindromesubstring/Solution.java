package leetcode.dynamicprogramming.longestpalindromesubstring;

public class Solution {
    int resultStart  =  0;
    int resultLength =  0;
    public String longestPalindrome(String str) {
        int n = str.length();
        if (n < 2) return str;
        for (int i = 0; i < n; i++) {
            expandRange(str, i, i);
            expandRange(str, i, i + 1);
        }
        return str.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int left, int right) {
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        int currentLength = (right - left)  - 1 ;
        if (currentLength > resultLength) {
            resultStart= left + 1;
            resultLength = right - resultStart;

        }
    }

}
