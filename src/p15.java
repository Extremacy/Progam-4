public class p15 {
    public static boolean[] showEvens(int[] nums) {
        boolean[] newArr = new boolean[nums.length];
        int index = 0;
        for (int n : nums
             ) {
            if (n % 2 == 0) {
                newArr[index] = true;
                index++;
            } else {
                newArr[index] = false;
                index++;
            }
        }
        return newArr;
    }
}
