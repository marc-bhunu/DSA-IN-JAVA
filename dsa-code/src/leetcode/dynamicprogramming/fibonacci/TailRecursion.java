package leetcode.dynamicprogramming.fibonacci;

public class TailRecursion {

    public int tailFib(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return tailFib(n - 1, b, a + b);
    }
}
