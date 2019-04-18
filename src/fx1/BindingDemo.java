package fx1;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {

    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        
        d1.bind(d2);
        System.out.println("d1 is " + d1.getValue() + " d2 is " + d2.getValue());
        d2.setValue(70.2);
        System.out.println("d1 is " + d1.getValue() + " d2 is " + d2.getValue());
       // d1.setValue(33);   -- This will crash because d1 is now locked under d2
    }
}
