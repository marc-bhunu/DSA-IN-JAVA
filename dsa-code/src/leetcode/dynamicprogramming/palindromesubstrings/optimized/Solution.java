package leetcode.dynamicprogramming.palindromesubstrings.optimized;

public class Solution {
    int result = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length() ; i++) {
            expandRange(s, i, i );
            expandRange(s, i, i + 1);
        }
        return result;
    }

    public void expandRange(String str, int start, int end){
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            result++;
            start--;
            end++;
        }
    }
}
