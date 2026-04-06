package leetcode.dynamicprogramming.fibonacci;

public class Fibonacci {
    static int count = 0;
    public static int fib(int n) {
        count++;
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void main() {
        fib(40);
        System.out.println(count);
    }

}
