package binding.Custom;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Main {

	public static void main(String[] args) {
		DoubleProperty a = new SimpleDoubleProperty(3);
		DoubleProperty b = new SimpleDoubleProperty(2);
		DoubleProperty c = new SimpleDoubleProperty(3);
		
		
		//c.bind(new PowBinding(a, new SimpleDoubleProperty(20)).add(b));
		c.bind(MathBindings.pow(a,2.0).add(2));
		
		System.out.println(c.get());
		
		a.set(5);
		
		System.out.println(c.get());
	}

}
