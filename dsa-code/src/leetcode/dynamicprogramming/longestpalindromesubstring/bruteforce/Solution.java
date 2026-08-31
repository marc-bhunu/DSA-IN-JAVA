package leetcode.dynamicprogramming.longestpalindromesubstring.bruteforce;

public class Solution {
    String result = "";
    public String longestPalindrome(String str){
        int n = str.length();
        if (n  < 2) return str;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                if (result.length() <= sub.length() && isPalindrome(sub)) {
                    result = sub;
                }
            }

        }
        return result;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }


}
