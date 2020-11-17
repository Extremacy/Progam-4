public class p5 {
    public static int[] insertSum(int[] nums) {
        int[] newArr = new int[3];
        newArr[0] = nums[0];
        newArr[1] = nums[0] + nums[1];
        newArr[2] = nums[1];
        return newArr;
    }
}
