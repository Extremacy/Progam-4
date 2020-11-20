public class p36 {
    public static int[] swapHalves(int[] nums) {
        int[] done = new int[nums.length];
        int index = 0;
        for (int i = nums.length /2; i < nums.length; i++) {
            done[index] = nums[i];
            index++;
        }
        for (int i = 0; i < nums.length / 2; i++) {
            done[index] = nums[i];
            index++;
        }
        return done;
    }
}
