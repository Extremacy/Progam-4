public class p1 {
    public static int[] removeSmaller(int[] nums) {
        int[] newArr = new int[1];
        if (nums[0] < nums[1]) {
            newArr[0] = nums[1];
        } else if (nums[0] > nums[1]) {
            newArr[0] = nums[0];
        } else if (nums[0] == nums[1]) {
            newArr = new int[0];
        }
        return newArr;
    }
}
