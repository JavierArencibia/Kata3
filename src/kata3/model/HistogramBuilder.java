package Kata3.model;

public class HistogramBuilder<Key> {

    private Histogram<Key> histogram;

    public void calculate(Key[] array) {
        histogram = new Histogram<>();
        for (Key item : array) {
            histogram.put(item, getCurrentCount(item) + 1);
        }
    }

    public Histogram getHistogram() {
        return histogram;
    }

    private int getCurrentCount(Key item) {
        Integer count = histogram.get(item);
        if (count == null)
            count = 0;
        return count;
    }
}
