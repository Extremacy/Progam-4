public class p22 {
    public static int[] statistics(int[] nums) {
        int[] done = new int[6];
        for (int n: nums
             ) {
            done[n - 1] = done[n -1] + 1;
        }
        return done;
    }
}
