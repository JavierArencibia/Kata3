package kata3.control;

import Kata3.model.HistogramBuilder;
import kata3.ui.HistogramViewer;

public class CalculateArrayHistogramControl<Key> {
    
    private Key[] array;

    public CalculateArrayHistogramControl(Key[] array) {
        this.array = array;
    }
       
    public void execute (){
        HistogramBuilder<Key> builder = new HistogramBuilder();
        builder.calculate(array);
        HistogramViewer<Key> viewer = new HistogramViewer(builder.getHistogram());
        viewer.show(); 
    }
}
