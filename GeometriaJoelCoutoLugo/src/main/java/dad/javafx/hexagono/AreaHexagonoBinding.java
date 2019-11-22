package dad.javafx.hexagono;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.FloatExpression;

public class AreaHexagonoBinding extends DoubleBinding {

	private FloatExpression radio;
	
	public AreaHexagonoBinding(FloatExpression radio) {
		super();
		
		this.radio = radio;
		bind(radio);
		
		
	}
	@Override
	protected double computeValue() {
		
		double perimetro = radio.get() * 6; 
		double radi = radio.get();
		double apotema = Math.sqrt(radi*radi - (radi/2)*(radi/2));
		
		return (apotema * perimetro) / 2;
	}

}
