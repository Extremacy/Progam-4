import java.util.GregorianCalendar;

public class p30 {
    public static int[] lastHalf(int[] nums) {
        int[] done = new int[nums.length / 2];
        int index = 0;
        for (int i = nums.length /2; i < nums.length; i++) {
            done[index] = nums[i];
            index++;
        }
        return done;
    }
}
