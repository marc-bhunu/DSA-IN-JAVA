package recursion_kimi.recursiontypes.fibonacci;

public class Fibonacci {

    static int fibHead(int n) {
        if (n <= 1) {
            return n;
        }
        return fibHead(n - 1) + fibHead(n - 2);
    }

    static int fibTail(int n, int a, int b) {
        if (n == 0) return a;
        if (n == 1) return b;

        return fibTail(n - 1, b, a +b);
    }

    static void main() {
        System.out.println(fibHead(10));
        System.out.println(fibTail(10, 0, 1));
    }
}
