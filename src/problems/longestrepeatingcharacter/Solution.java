package problems.longestrepeatingcharacter;

public class Solution {

    public boolean isUnique(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String string = s.substring(i, j);
                if (isUnique(string)) {
                    maxLength = Math.max(maxLength, string.length());
                }
            }
        }
        return maxLength;
    }
}
