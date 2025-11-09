package recursion_kimi.backtracking;

public class Backtracking {

    static void generate(String current, int n) {

        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        generate(current + "0", n);

        generate(current + "1", n);
    }

    public static void main(String[] args) {
        generate("", 4);
    }
}
