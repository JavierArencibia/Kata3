package kata3;

import kata3.control.CalculateArrayHistogramControl;
import kata3.control.CalculateEmailDomainHistogramControl;

public class Main {

    public static void main(String[] args) {
       Integer[] array = {1,2,1,5,1,2,3};
       CalculateArrayHistogramControl<Integer> control = new CalculateArrayHistogramControl(array);
       control.execute();
       
       String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Main\\src\\kata3\\correos.txt";
       CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
       control2.execute();
    }
}
