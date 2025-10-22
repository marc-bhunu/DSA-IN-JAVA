package leetcode.productofarrayexceptitself;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 3, 4, 1};
        int[] result = solution.productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
