package dad.javafx.recursosFormas;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.shape.Polygon;

public class Poligono extends Polygon {


	private IntegerProperty lados = new SimpleIntegerProperty();
	private DoubleProperty radio = new SimpleDoubleProperty();
	
	public Poligono(double radio, int lados) {
		super();
		this.radio.set(radio);
		this.lados.set(lados);
		
		generarFigura(); 
		
		this.radio.addListener((o, lv, nv) -> generarFigura());
		this.lados.addListener((o, lv, nv) -> generarFigura() );
	}

	public Poligono() {
		this(0.0, 0);
	}
	
	private void generarFigura() {
		double radio = getRadio();
		double lados = getLados();
		
		getPoints().clear();
		
		for( int i = 0; i < lados; i++ ) {
			double x = radio + radio * Math.cos(i * 2 * Math.PI / lados);
			double y = radio + radio * Math.sin(i * 2 * Math.PI / lados);
			getPoints().addAll(x,y);
		}
	}

	public final DoubleProperty radioProperty() {
		return this.radio;
	}
	

	public final double getRadio() {
		return this.radioProperty().get();
	}
	

	public final void setRadio(double radio) {
		this.radioProperty().set(radio);
	}

	public final IntegerProperty ladosProperty() {
		return this.lados;
	}
	

	public final int getLados() {
		return this.ladosProperty().get();
	}
	

	public final void setLados(int lados) {
		this.ladosProperty().set(lados);
	}
	
	
}
