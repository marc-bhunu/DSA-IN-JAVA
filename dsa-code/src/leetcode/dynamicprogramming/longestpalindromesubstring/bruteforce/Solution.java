package leetcode.dynamicprogramming.longestpalindromesubstring.bruteforce;

public class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String currStr = s.substring(i, j);
                if(isPalindrome(currStr)){
                    if (result.length() < currStr.length()) {
                        result = currStr;
                    }
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        if (s.length() ==  1 || s.length() == 2) return true;
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
