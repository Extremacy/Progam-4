public class p27 {
    public static int[] repeat(int[] nums, int n) {
        int[] done = new int[nums.length * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int x : nums
                 ) {
                done[index] = x;
                index++;
            }
        }
        return done;
    }
}
