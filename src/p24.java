public class p24 {
    public static int[] duplicateLast(int[] nums) {
        int[] done = new int[nums.length + 1];
        int index = 0;
        for (int n : nums
             ) {
            done[index] = n;
            index++;
        }
        done[index] = nums[nums.length - 1];
        return done;
    }
}
