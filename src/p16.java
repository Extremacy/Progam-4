public class p16 {
    public static int[] loseThe2(int[] nums) {
        int[] newArr = new int[nums.length - 1];
        int index = 0;
        for (int n : nums
             ) {
            if (n != 2) {
                newArr[index] = n;
                index++;
            }
        }
        return newArr;
    }
}
