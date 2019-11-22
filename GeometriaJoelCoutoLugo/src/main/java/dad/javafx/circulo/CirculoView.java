package dad.javafx.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends GridPane {

	private Circle circulo;
	private Label areaLabelTexto, perimetroLabelTexto;
	private Label radioLabel;
	private Label areaLabel, perimetroLabel;
	private TextField textoRadio;
	
	public CirculoView() {
		super();
		
		circulo = new Circle();
		circulo.setFill(Color.CHARTREUSE);
		circulo.setStrokeWidth(4);
		circulo.setStroke(Color.BLACK);
		
		radioLabel = new Label("Radio del circulo:");
		
		textoRadio = new TextField();
		textoRadio.setPromptText("Radio");
		textoRadio.setPrefColumnCount(5);
		
		areaLabel = new Label("Area del circulo:");
		perimetroLabel = new Label("Perímetro:");
		
		areaLabelTexto = new Label();
		perimetroLabelTexto = new Label();
		
		addRow(0, radioLabel, textoRadio);
		addColumn(3, circulo);
		
		setColumnSpan(circulo, 2);
		setHalignment(circulo, HPos.CENTER);
		
		addRow(1, areaLabel, areaLabelTexto);
		addRow(2, perimetroLabel, perimetroLabelTexto);
		
		setAlignment(Pos.CENTER);
		setHgap(10);
		setVgap(5);
	}

	public TextField getRadioTexto() {
		return textoRadio;
	}

	public Label getAreaLabelTexto() {
		return areaLabelTexto;
	}

	public Label getPerimetroLabelTexto() {
		return perimetroLabelTexto;
	}

	public Circle getCirculo() {
		return circulo;
	}
}
