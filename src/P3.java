public class P3 {
    public static int sumFirstLast(int[] nums) {
        int sum = 0;
        sum += nums[0];
        sum += nums[nums.length - 1];
        return sum;
    }
}
