public class p18 {
    public static int[] addToFront(int[] nums, int value) {
        int[] result = new int[nums.length + 1];
        result[0] = value;
        int index = 1;
        for (int n : nums
             ) {
            result[index] = n;
            index++;
        }
        return result;
    }
}
