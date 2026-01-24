package recursion_kimi.recursiontypes.factorial;

public class Factorial {
    static int fact(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n * fact(n-1);
    }

    static int tailFact(int n, int acc){
        if (n <= 1) return acc;
        return tailFact(n - 1, acc * n);
    }

    static void main() {
        System.out.println(fact(5));
        System.out.println(tailFact(10, 1));
    }
}
