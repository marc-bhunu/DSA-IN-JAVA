package recursion_kimi.recursiontypes.search.binarysearch;

public class BinarySearch {

    static int binarySearchIterative(int[] container, int item) {
        int low = 0;
        int high = container.length - 1;
        int midpoint = 0;

        while (low <= high) {
            midpoint = low + (high - low) / 2;
            if (container[midpoint] == item) {
                return midpoint;
            }
            if (item > container[midpoint]) {
                low = midpoint + 1;
            } else if (item < container[midpoint]) {
                high = midpoint - 1;
            }
        }
        return -1;
    }


    static int binarySearchRecursive(int[] container, int item) {
        return helper(container, item, 0, container.length - 1);
    }

    private static int helper(int[] container, int item, int start, int end) {
        if (start > end) return -1;
        int midpoint = start + (end - start) / 2;
        if (container[midpoint] == item) return midpoint;
        if (item < container[midpoint]) {
            return helper(container, item, start, midpoint - 1);
        } else {
            return helper(container, item, midpoint + 1, end);
        }
    }

    static void main() {
        System.out.println(binarySearchIterative(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));
        System.out.println(binarySearchRecursive(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));
    }
}
