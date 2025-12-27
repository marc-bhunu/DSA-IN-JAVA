package algorithms.binarysearch;

public class BinarySearch {

    public boolean binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mindpoint = left + (right - left) / 2;
            if (arr[mindpoint] == target) {
                return true;
            } else if (arr[mindpoint] < target) {
                left = mindpoint + 1;
            } else {
                right = mindpoint - 1;
            }
        }
        return false;
    }

}