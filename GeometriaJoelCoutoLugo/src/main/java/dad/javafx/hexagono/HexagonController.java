package dad.javafx.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonController {

	private HexagonoModel model;
	private HexagonoView view;
	
	public HexagonController() {
		
		model = new HexagonoModel();
		view = new HexagonoView();
		
		model.setRadio(50);
		view.getRadiusTxt().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		view.getAreaTxt().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimeterTxt().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
		view.getHexagonShape().radioProperty().bind(model.radioProperty());
	}
	
	public HexagonoView getRoot() {
		return view;
	}
}
