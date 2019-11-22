package dad.javafx.rectangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class RectangleModel {

	private DoubleProperty ancho = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();
	
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	
	public RectangleModel() {
		
		area.bind(ancho.multiply(altura));
		perimetro.bind(ancho.add(altura).multiply(2));
	}

	public final DoubleProperty anchoProperty() {
		return this.ancho;
	}
	

	public final double getAncho() {
		return this.anchoProperty().get();
	}
	

	public final void setAncho(final double ancho) {
		this.anchoProperty().set(ancho);
	}
	

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}
	

	public final double getAltura() {
		return this.alturaProperty().get();
	}
	

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
	
}
