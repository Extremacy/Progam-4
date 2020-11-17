public class p10 {
    public static int maxBelow50(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int n : nums
             ) {
            if (n > max && n < 50) {
                max = n;
            }
        }
        return max;
    }
}
