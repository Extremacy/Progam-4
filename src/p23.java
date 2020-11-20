public class p23 {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        removeFirst(test, 5);
    }
    public static int[] removeFirst(int[] nums, int val) {
        if (nums.length == 0) {
            int[] done = new int[0];
            return done;
        }
        int[] done = new int[nums.length - 1];
        int index = 0;
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (!found) {
                if (nums[i] == val) {
                    found = true;
                } else {
                    done[index] = nums[i];
                    index++;
                }
            } else {
                done[index] = nums[i];
                index++;
            }
        }
        return done;
    }
}
