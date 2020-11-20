public class p41 {
    public static int findTheDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter == 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
