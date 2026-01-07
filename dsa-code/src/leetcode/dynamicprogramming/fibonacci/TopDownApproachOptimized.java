package leetcode.dynamicprogramming.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class TopDownApproachOptimized {

    static Map<Integer, Integer> memo = new HashMap<>();

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int fib = fib(n - 1) + fib(n - 2);

        memo.put(n, fib);

        return fib;
    }

    static void main() {
        System.out.println(fib(20));
        System.out.println(fib(40));
    }
}
