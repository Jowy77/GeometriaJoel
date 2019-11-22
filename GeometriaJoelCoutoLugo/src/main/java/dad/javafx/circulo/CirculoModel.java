package dad.javafx.circulo;


import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;

public class CirculoModel {
	
	private ReadOnlyFloatWrapper perimetro = new ReadOnlyFloatWrapper();
	private FloatProperty radio = new SimpleFloatProperty();
	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	
	
	
	public CirculoModel() {
		
		area.bind(radio.multiply(Math.PI).multiply(radiosProperty()));
		perimetro.bind(radio.multiply(Math.PI*2));
	}


	public final FloatProperty radiosProperty() {
		return this.radio;
	}
	


	public final float getRadio() {
		return this.radiosProperty().get();
	}
	


	public final void setRadio(final float radius) {
		this.radiosProperty().set(radius);
	}
	


	public final ReadOnlyFloatProperty areaProperty() {
		return this.area;
	}
	


	public final float getArea() {
		return this.areaProperty().get();
	}
	


	public final ReadOnlyFloatProperty perimetroProperty() {
		return this.perimetro;
	}
	


	public final float getPerimetro() {
		return this.perimetroProperty().get();
	}
	


	
	
	
	
	
	
}
