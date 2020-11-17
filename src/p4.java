public class p4 {
    public static boolean increasing3(int[] nums) {
        boolean isIncreasing = true;
        if (nums[1] <= nums [0]) {
            isIncreasing = false;
        }
        if (nums[2] <= nums [1]) {
            isIncreasing = false;
        }
        return isIncreasing;
    }
}
