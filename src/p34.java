public class p34 {
    public static int[] fill(int size, int value) {
        int[] done = new int[size];
        for (int i = 0; i < done.length; i++) {
            done[i] = value;
        }
        return done;
    }
}
