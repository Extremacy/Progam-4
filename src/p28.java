public class p28 {
    public static int indexOf(int[] nums, int key) {
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            if (counter != 2) {
                if (nums[i] == key) {
                    counter++;
                }
            } else {
                if (nums[i] == key) {
                    return i;
                }
            }
        }
        return -1;
    }
}

