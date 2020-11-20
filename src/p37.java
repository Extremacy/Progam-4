public class p37 {
    public static int[] evenPositions(int[] nums) {
        if (nums.length % 2 == 1) {
            int[] done = new int[nums.length / 2 + 1];
            int index = 0;
            for (int i=0; i < nums.length; i++) {
                if (i%2 == 0) {
                    done[index] = nums[i];
                    index++;
                }
            }
            return done;
        } else {
            int[] done = new int[nums.length / 2];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    done[index] = nums[i];
                    index++;
                }
            }
            return done;
        }
    }
}
