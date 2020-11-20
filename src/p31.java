public class p31 {
    public static int[] runningTotal(int[] nums) {
        int[] done = new int[nums.length];
        int sum = 0;
        int index = 0;
        for (int n : nums
             ) {
            sum += n;
            done[index] = sum;
            index++;
        }
        return done;
    }
}
