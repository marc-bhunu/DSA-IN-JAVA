package leetcode.dynamicprogramming.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class TopDownApproachOptimized {
    static int count = 0;
    static Map<Integer, Integer> memo = new HashMap<>();

    static int fib(int n) {
        count++;
        if (n <= 1) return n;
        if (memo.containsKey(n))return memo.get(n);
        int fib = fib(n - 1) + fib(n - 2);
        memo.put(n, fib);
        return fib;
    }

    static void main() {
        System.out.println(fib(40));
        System.out.println(count);
    }
}
