package leetcode.dynamicprogramming.wordbreak.recurssive;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static void main() {
        Solution solution = new Solution();
        System.out.println(solution.wordBreak("catsandog", new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"))));
    }
}
