package leetcode.binarysearch.searchinarotatedarray;

public class Solution {

    public int findMinIndex(int[] nums){
        int left = 0, right = nums.length -1;
        while(left < right){
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    private int binarySearch(int left, int right, int target, int[] nums){
        while(left <= right){
            int mid = (right + left) /2;
            if (nums[mid]== target) {
                return mid;
            }else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return  -1;
    }


    public int search(int[] nums, int target) {

        int pivot = findMinIndex(nums);
        int left =0, right = nums.length - 1;

        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot - 1;
        }

        System.out.println("right index: "+ right + " left index: " + left);
        return binarySearch(left, right, target, nums);
    }

}
