package leetcode.dynamicprogramming.wordbreak.bottomup;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static void main() {
        Solution solution = new Solution();
        System.out.println(solution.wordBreak("neetcode", new ArrayList<>(Arrays.asList("neet", "code"))));
    }
}
