package leetcode.twopointers.validpalindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        if (s == null || s.equals(" ")) return false;
        int left = 0;
        int right = s.length() - 1;
        
        s = s.toLowerCase();

        while(left < right){

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}