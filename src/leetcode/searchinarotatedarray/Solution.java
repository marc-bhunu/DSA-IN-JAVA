package leetcode.searchinarotatedarray;

public class Solution {

    public  int findMinIndex(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }else{
                right  = mid;
            }
        }
        return left;
    }

    public int binarySearch(int[] nums, int target, int left, int right){
        while (left <= right){
            int mid = left +(right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return  -1;
    }

    public int search(int[] nums, int target) {
        int minIndex = findMinIndex(nums), left=0, right=0;
        if (minIndex == 0) {
            right = nums.length - 1;
        } else if ((nums[minIndex]  <= target) && (target <= nums[nums.length - 1])) {
            left = minIndex;
            right = nums.length - 1;
        }else{
            left = 0;
            right = minIndex - 1;
        }
        return  binarySearch(nums, target, left, right);
    }

}
