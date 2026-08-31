package leetcode.dynamicprogramming.wordbreak.recurssive;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        System.out.println(solution2
                .wordBreak("carcatpiebut",
                        new ArrayList<>(Arrays.asList("car", "cat", "pie", "but", "cat", "og"))));
    }

}
