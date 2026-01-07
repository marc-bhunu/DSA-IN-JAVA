package leetcode.dynamicprogramming.fibonacci;

public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void main() {
        System.out.println(fib(40));
        System.out.println(fib(40));
        System.out.println(fib(40));
    }

}
