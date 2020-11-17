public class p6 {
    public static int sumLast2(int[] nums) {
        int sum = 0;
        sum += nums[nums.length - 1];
        sum += nums[nums.length - 2];
        return sum;
    }
}
