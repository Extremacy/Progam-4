public class p29 {
    public static int[] removeAll(int value, int[] nums) {
        int counter = 0;
        for (int n : nums
             ) {
            if (n == value) {
                counter++;
            }
        }
        int[] done = new int[nums.length - counter];
        int index = 0;
        for (int n : nums
             ) {
            if (n != value) {
                done[index] = n;
                index++;
            }
        }
        return done;
    }
}
