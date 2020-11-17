public class p12 {
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int n: nums
        ) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
