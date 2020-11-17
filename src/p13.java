public class p13 {
    public static boolean targetPair(int[] nums, int target) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] + nums[i + 1] == target) {
                return true;
            }
            i++;
        }
        return false;
    }
}
