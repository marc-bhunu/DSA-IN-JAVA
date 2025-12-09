package recursion_kimi.backtracking;

public class GroupSum6 {

    public  static boolean groupSum6(int start, int[] nums, int target){
        if (start >= nums.length) return target == 0;
        if (nums[start] == 6){
            return groupSum6(start + 1, nums, target - nums[start]);
        }else{
            if (groupSum6(start + 1, nums, target - nums[start]))return true;
            if (groupSum6(start + 1, nums, target))return true;
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2};
        System.out.println(groupSum6(0, arr, 8));
    }
}
