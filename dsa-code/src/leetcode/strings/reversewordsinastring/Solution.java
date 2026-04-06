package leetcode.strings.reversewordsinastring;

public class Solution {

    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        int left = 0;
        int right = strArr.length - 1;
        while(left < right){
            String temp  = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for (String word: strArr){
            if (!word.isEmpty()) {
                sb.append(word);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

}
