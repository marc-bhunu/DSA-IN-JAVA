package recursion_kimi.codingbat;

public class BinarySearch {
    static String binarySearch(int[] arr, int target, int start, int end){
        if (start > end) return  "Not found";
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return "Found " + arr[mid] + " @index " + mid;
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }else{
            return binarySearch(arr, target, mid + 1, end);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,67,88,99,999,8000};
        System.out.println(binarySearch(arr, 8, 0, arr.length - 1));
        System.out.println(binarySearch(arr, 8000, 0, arr.length - 1));
    }
}
