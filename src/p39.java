public class p39 {
    public static int[] join(int[] a, int[] b) {
        int[] done = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            done[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            done[index] = b[i];
            index++;
        }
        return done;
    }
}
