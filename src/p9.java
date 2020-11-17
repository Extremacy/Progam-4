public class p9 {
    public static int[] reverseArray(int[] nums) {
        int[] newArr = new int[nums.length];
        int index = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            newArr[index] = nums[i];
            index--;
        }
        return newArr;
    }
}
