public class p19 {
    public static int[] addToEnd(int[] nums, int value) {
        int[] result = new int[nums.length + 1];
        result[result.length - 1] = value;
        int index = 0;
        for (int n : nums
        ) {
            result[index] = n;
            index++;
        }
        return result;
    }
}
