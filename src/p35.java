public class p35 {
    public static int[] sumArrays(int[] a, int[] b) {
        int[] done = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            done[i] = a[i] + b[i];
        }
        return done;
    }
}
