public class p20 {
    public static int[] resize(int[] nums, int size) {
        int[] result = new int[size];
        int i = 0;
        for (int n : nums
        ) {
            if (i < size) {
                result[i] = n;
                i++;
            }
        }
        while (i < size) {
            result[i] = -1;
            i++;
        }
        return result;
    }
}
