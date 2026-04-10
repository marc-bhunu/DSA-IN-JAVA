package leetcode.binarysearch.search;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1, midpoint;
        while (left <= right) {
            midpoint = left + (right - left) / 2;
            if (arr[midpoint] == target) {
                return midpoint;
            } else if (arr[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {-1, 0, 1, 2, 3, 4, 5, 6};
        System.out.println(search(arr, 6));
    }
}
