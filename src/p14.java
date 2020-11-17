public class p14 {
    public static boolean sameParity(int[] nums) {
        if (nums.length == 0) {
            return true;
        } else {
            if (nums[0] % 2 == 0) {
                for (int n : nums
                ) {
                    if (n % 2 != 0) {
                        return false;
                    }
                }
            } else {
                for (int n : nums
                ) {
                    if (n % 2 != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
