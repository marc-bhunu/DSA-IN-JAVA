package recursion_kimi.recursiontypes.fibonacci;

public class Iterative {

    static void iterative(int n){
        int a = 0;
        int b = 1;

        while(a< n) {
            System.out.println(a);
            int temp = b;
            b = a + b;
            a = temp;
        }
    }

    static void main() {
        iterative(11);
    }
}
