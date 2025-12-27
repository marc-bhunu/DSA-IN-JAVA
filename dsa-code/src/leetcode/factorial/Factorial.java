package leetcode.factorial;

import java.util.HashMap;
import java.util.Map;

public class Factorial {

    private static final Map<Integer, Integer> map = new HashMap<>();

    public static int factorial(int n){
        if (n  == 0 || n ==  1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result =   n * factorial(n- 1);

        map.put(n, result);
        return  result;
    }
    public static void main(String[] args) {
        int result = factorial(10);
        System.out.println(result);
    }
}
