package leetcode.dynamicprogramming.wordbreak.bottomup;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution
                .wordBreak("neetneet",
                        new ArrayList<>(Arrays.asList("neet", "neet"))));
    }
}
