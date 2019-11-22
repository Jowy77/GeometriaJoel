package dad.holamundo.mvc;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;

public class Controller {
	
	//normalmente el view se llama root
	private Modelo model = new Modelo();
	private View view = new View();
	
	
	public Controller() {
		
		model.nombreProperty().bind(view.getNombreText().textProperty());
		
		view.getSaludoLabel().textProperty().bind(
				
				Bindings
					.when(model.saludoProperty().isEmpty())
					.then("Hola nadie!!!")
					.otherwise(model.saludoProperty())
				
				);
		
		view.getSaludoButton().setOnAction(e -> onSaludarAction(e));
		
	}
	
	private void onSaludarAction(ActionEvent e) {
		if(!model.getNombre().isEmpty())
		model.setSaludo("Que paso " + model.getNombre()+"?");
		else
			model.setSaludo("");
	}

	public View getRoot() {
		return view;
	}

}
