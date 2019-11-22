package dad.javafx.hexagono;

import dad.javafx.recursosFormas.Poligono;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class HexagonoView extends GridPane {
	
	private Poligono hexagono;
	private Label radioLabel;
	private Label areaLabel, perimeterLabel;
	private TextField radioTexto;
	private Label areaTextoLabel, perimetroTextoLabel;
	
	public HexagonoView() {
		super();
		radioLabel = new Label("Radio:");
		
		radioTexto = new TextField();
		radioTexto.setPromptText("Radio");
		radioTexto.setPrefColumnCount(5);
		
		hexagono = new Poligono();
		hexagono.setLados(6);
		hexagono.setFill(Color.AZURE);
		hexagono.setStrokeWidth(4);
		hexagono.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimeterLabel = new Label("Perímetro:");
		
		areaTextoLabel = new Label();
		perimetroTextoLabel = new Label();
		
		setColumnSpan(hexagono, 2);
		setHalignment(hexagono, HPos.CENTER);
		
		addRow(0, radioLabel, radioTexto);
		addColumn(3, hexagono);
		
		addRow(2, areaLabel, areaTextoLabel);
		addRow(3, perimeterLabel, perimetroTextoLabel);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getRadiusTxt() {
		return radioTexto;
	}

	public Label getAreaTxt() {
		return areaTextoLabel;
	}

	public Label getPerimeterTxt() {
		return perimetroTextoLabel;
	}

	public Poligono getHexagonShape() {
		return hexagono;
	}
}
