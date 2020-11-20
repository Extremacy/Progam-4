public class p38 {
    public static boolean pair10(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + nums[i + 1]) % 10 == 0) {
                return true;
            }
        }
        return false;
    }
}
