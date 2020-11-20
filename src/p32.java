public class p32 {
    public static boolean hasSymmetry(int[] nums) {
        boolean symmetric = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                symmetric = false;
            }
        }
        return symmetric;
    }
}
