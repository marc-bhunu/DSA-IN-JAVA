package recursion_kimi.codingbat;

public class Array220 {
    public static boolean array220(int[] nums, int index){
        boolean result = false;
        int nextIndex = index + 1;
        if (nextIndex > nums.length - 1) return result;
        if (nums[index] * 10 == nums[nextIndex]) {
            result = true;
        }else{
            result = array220(nums, index + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 20};
        int [] nums2 = {3, 30};
        int [] nums3 = {3};
        System.out.println(array220(nums, 0));
        System.out.println(array220(nums2, 0));
        System.out.println(array220(nums3, 0));
    }
}
