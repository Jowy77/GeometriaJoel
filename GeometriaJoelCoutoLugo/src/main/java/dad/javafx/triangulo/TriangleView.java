package dad.javafx.triangulo;

import dad.javafx.recursosFormas.Triangulo;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TriangleView extends GridPane {
	
	private Label baseLabel, alturaLabel;
	private Label areaLabel, perimetroLabel;
	private TextField baseTexto, altuaTexto;
	private Label areaTexto, perimetroTexto;
	private Triangulo triangulo;
	
	public TriangleView() {
		super();
		
		baseLabel = new Label("Base:");
		alturaLabel = new Label("Altura:");
		
		baseTexto = new TextField();
		baseTexto.setPromptText("Base");
		baseTexto.setPrefColumnCount(5);
		altuaTexto = new TextField();
		altuaTexto.setPromptText("Altura");
		altuaTexto.setPrefColumnCount(5);
		
		triangulo = new Triangulo();
		triangulo.setFill(Color.KHAKI);
		triangulo.setStrokeWidth(3);
		triangulo.setStroke(Color.BLACK);	
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaTexto = new Label();
		perimetroTexto = new Label();

		addRow(0, baseLabel, baseTexto);
		addRow(1, alturaLabel, altuaTexto);
		addColumn(3, triangulo);
		
		setColumnSpan(triangulo, 2);
		setHalignment(triangulo, HPos.CENTER);
		
		addRow(3, areaLabel, areaTexto);
		addRow(4, perimetroLabel, perimetroTexto);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getBaseTexto() {
		return baseTexto;
	}

	public TextField getAlturaTexto() {
		return altuaTexto;
	}

	public Label getAreaTexto() {
		return areaTexto;
	}

	public Label getPerimetroTexto() {
		return perimetroTexto;
	}

	public Triangulo getTriangulo() {
		return triangulo;
	}

}
