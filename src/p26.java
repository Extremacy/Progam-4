public class p26 {
    public static int[] allButFirst(int[] nums) {
        if (nums.length == 0) {
            int[] done = new int[0];
            return done;
        }
        int[] done = new int[nums.length - 1];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            done[index] = nums[i];
            index++;
        }
        return done;
    }
}
