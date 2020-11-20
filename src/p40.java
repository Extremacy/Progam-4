public class p40 {
    public static boolean hasSum(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                sum = 0;
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
