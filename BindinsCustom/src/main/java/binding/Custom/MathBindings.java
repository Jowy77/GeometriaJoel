package binding.Custom;

import javafx.beans.binding.DoubleExpression;
import javafx.beans.property.SimpleDoubleProperty;

public class MathBindings {
	
	public static PowBinding pow(DoubleExpression b, DoubleExpression e) {
		return new PowBinding(b, e);
	}
	
	public static PowBinding pow(DoubleExpression b, Double e) {
		return new PowBinding(b, new SimpleDoubleProperty(e));
	}
	
	public static PowBinding pow(Double b, DoubleExpression e) {
		return new PowBinding(new SimpleDoubleProperty(b),e);
	}
	
	
	public static SqrtBinding root(DoubleExpression number) {
		return new SqrtBinding(number);
	}
	
	public static SqrtBinding root(Double e) {
		return new SqrtBinding(new SimpleDoubleProperty(e));
	}

}
