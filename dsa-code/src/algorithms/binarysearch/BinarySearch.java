package algorithms.binarysearch;

public class BinarySearch {

    public boolean binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (arr[midpoint] == target) {
                return true;
            } else if (arr[midpoint] < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return false;
    }

}