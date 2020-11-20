public class p21 {
    public static int countRaises(int[] nums) {
        int raises = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                raises++;
            }
        }
        return raises;
    }
}
