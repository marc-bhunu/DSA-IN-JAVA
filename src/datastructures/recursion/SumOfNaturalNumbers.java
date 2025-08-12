package datastructures.recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
        System.out.println(sum(10)); // Output: 55
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
