package binding.Custom;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class SqrtBinding extends DoubleBinding{
	
	private DoubleExpression raiz;
	
	public SqrtBinding(DoubleExpression raiz) {
		super();
		this.raiz=raiz;
		bind(raiz);
	}

	@Override
	protected double computeValue() {
		return Math.sqrt(raiz.get());
	}
	
}

