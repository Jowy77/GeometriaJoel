package dad.javafx.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleView extends GridPane {

	private TextField anchoTexto, alturaTexto;
	private Label areaTextoLabel, perimetroTextoLabel;
	private Label anchoLabel, alturaLabel;
	private Label areaLabel, perimetroLabel;
	private Rectangle rectangulo;
	
	public RectangleView() {
		super();
		
		rectangulo = new Rectangle();
		rectangulo.setFill(Color.CRIMSON);
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);
		
		anchoLabel = new Label("Ancho:");
		alturaLabel = new Label("Alto:");
		
		anchoTexto = new TextField();
		anchoTexto.setPromptText("Ancho");
		anchoTexto.setPrefColumnCount(5);
		alturaTexto = new TextField();
		alturaTexto.setPromptText("Alto");
		alturaTexto.setPrefColumnCount(5);
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaTextoLabel = new Label();
		perimetroTextoLabel = new Label();

		addRow(0, anchoLabel, anchoTexto);
		addRow(1, alturaLabel, alturaTexto);
		addColumn(3, rectangulo);
		
		setColumnSpan(rectangulo, 2);
		setHalignment(rectangulo, HPos.CENTER);
		
		addRow(3, areaLabel, areaTextoLabel);
		addRow(4, perimetroLabel, perimetroTextoLabel);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}
	
	public Label getAreaTexto() {
		return areaTextoLabel;
	}

	public Label getPerimetroTexto() {
		return perimetroTextoLabel;
	}

	public TextField getAnchoTexto() {
		return anchoTexto;
	}

	public TextField getAlturaTexto() {
		return alturaTexto;
	}

	public Rectangle getRectangulo() {
		return rectangulo;
	}
}
