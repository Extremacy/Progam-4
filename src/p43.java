public class p43 {
    public static int singlesCount(int[] nums) {
        int counter = 0;
        int singleCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
                singleCounter++;
            }
        }
        return singleCounter;
    }
}
