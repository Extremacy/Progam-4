public class p42 {
    public static int findSubArray(int[] sub, int[] nums) {
        outer:
        for (int i = 0; i <= nums.length - sub.length; ++i) {
            for (int j = 0; j < sub.length; ++j) {
                if (nums[i + j] != sub[j]) {
                    continue outer;
                }
            }

            return i;
        }

        return -1;
    }
}
