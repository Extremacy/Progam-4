public class p11 {
    public static int sumNo5(int[] nums) {
        int sum = 0;
        for (int n: nums
             ) {
            if (n % 5 != 0) {
                sum += n;
            }
        }
        return sum;
    }
}
