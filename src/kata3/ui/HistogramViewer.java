package kata3.ui;

import Kata3.model.Histogram;

public class HistogramViewer<Key> {
    private Histogram<Key> histogram;

    public HistogramViewer(Histogram<Key> histogram) {
        this.histogram = histogram;
    }
    
    public void show(){
        for (Key item : histogram.keySet()){
            System.out.println(item + ": " + histogram.get(item));
        }
    }
}
