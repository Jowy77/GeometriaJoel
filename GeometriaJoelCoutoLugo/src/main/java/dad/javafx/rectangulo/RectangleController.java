package dad.javafx.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectangleController {

	private RectangleModel model;
	private RectangleView view;

	public RectangleController() {

		model = new RectangleModel();
		view = new RectangleView();

		model.alturaProperty().set(50);
		model.anchoProperty().set(100);

		view.getAnchoTexto().textProperty().bindBidirectional(model.anchoProperty(), new NumberStringConverter());
		view.getAlturaTexto().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());

		view.getAreaTexto().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroTexto().textProperty().bind(Bindings.selectString(model.perimetroProperty()));

		view.getRectangulo().heightProperty().bind(model.alturaProperty());
		view.getRectangulo().widthProperty().bind(model.anchoProperty());
	}

	public RectangleView getRoot() {
		return view;
	}
}
