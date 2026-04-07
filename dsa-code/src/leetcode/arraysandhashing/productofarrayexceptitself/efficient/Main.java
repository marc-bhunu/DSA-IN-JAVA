package leetcode.arraysandhashing.productofarrayexceptitself.efficient;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 4, 6};
        int[] result = solution.productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
