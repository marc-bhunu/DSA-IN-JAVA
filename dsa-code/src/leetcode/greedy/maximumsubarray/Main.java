package leetcode.greedy.maximumsubarray;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
        int[] arr = new int[]{-2,1};
        System.out.println(solution.maxSubArray(arr));
        System.out.println(kadaneAlgorithm.maxSubArray(arr));
    }
}
