package dad.javafx.circulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CirculoController {

	private CirculoModel model;
	private CirculoView view;
	
	public CirculoController() {
		
		model = new CirculoModel();
		view = new CirculoView();
		
		model.radiosProperty().setValue(50);
		view.getRadioTexto().textProperty().bindBidirectional(model.radiosProperty(), new NumberStringConverter());
		view.getAreaLabelTexto().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroLabelTexto().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
		
		view.getCirculo().radiusProperty().bind(model.radiosProperty());
		
	}
	
	public CirculoView getRoot() {
		return view;
	}
}
