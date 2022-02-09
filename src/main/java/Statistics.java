public class Statistics {
    private final int[] data;

    public Statistics(int[] data) {
        this.data = data;
    }

    public int max() {
        int max = data[0];
        for (int e : data) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }
}
