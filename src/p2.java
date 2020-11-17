public class p2 {
    public static int max2(int[] nums) {
        int done = 0;
        if(nums[0] > nums[1]) {
            done = nums[0];
        } else {
            done = nums[1];
        }
        return done;
    }

}
