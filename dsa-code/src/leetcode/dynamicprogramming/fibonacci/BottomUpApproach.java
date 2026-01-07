package leetcode.dynamicprogramming.fibonacci;

public class BottomUpApproach {
    static int fib(int n) {
        int[] dp = {0, 1};
        int i = 2;
        while (i <= n) {
            int temp = dp[1];
            dp[1] = dp[0] + dp[1];
            dp[0] = temp;
            i++;
        }
        return dp[1];
    }

    static void main() {
        System.out.println(fib(20));
        System.out.println(fib(40));
    }
}
