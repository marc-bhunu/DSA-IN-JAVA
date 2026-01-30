package leetcode.dynamicprogramming.longestpalindromesubstring.bruteforce;

public class Solution {
    String resultantString = "";
    public String longestPalindrome(String str){
        if (str.length()  < 2) return str;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String currentString = str.substring(i, j);
                if (isPalindrome(currentString)) {
                    if (resultantString.length() <= currentString.length()) {
                        resultantString = currentString;
                    }
                }
            }
        }
        return resultantString;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if (str.charAt(left) != str.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}
