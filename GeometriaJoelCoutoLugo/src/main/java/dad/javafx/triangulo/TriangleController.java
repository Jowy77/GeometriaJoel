package dad.javafx.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TriangleController {

	private TriangleModel model;
	private TriangleView view;
	
	public TriangleController() {
		
		model = new TriangleModel();
		view = new TriangleView();
		
		model.baseProperty().set(50);
		model.alturaProperty().set(50);
		
		view.getBaseTexto().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaTexto().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		
		view.getAreaTexto().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroTexto().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
		
		view.getTriangulo().alturaProperty().bind(model.alturaProperty());
		view.getTriangulo().baseProperty().bind(model.baseProperty());
	}
	
	public TriangleView getRoot() {
		return view;
	}
}
