package dad.javafx.BuscarReemplazar;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ViewB_R{
	
	private Label search_label;
	private Label replace_label;
	private TextField searchText;
	private TextField replaceText;
	private CheckBox mayusMinis;
	private CheckBox searchBackwards;
	private CheckBox regularExp;
	private CheckBox resaltarResult;
	private Button buscar_button;
	private Button replace_button;
	private Button replace_all_button;
	private Button closeButon;
	private Button helpButton;
	
	public ViewB_R(){
		//labels
		search_label = new Label("Buscar:");
		replace_label = new Label("Reemplazar con:");
		//checks
		mayusMinis = new CheckBox("Mayusculas y minusculas");
		searchBackwards = new CheckBox("Buscar hacia atras");
		regularExp = new CheckBox("Expresion regular");
		resaltarResult = new CheckBox("Resaltar resultados");
		//buttons
		buscar_button = new Button("Buscar");
		replace_button = new Button("Reemplazar");
		replace_all_button = new Button("Reemplazar todo");
		closeButon = new Button("Cerrar");
		helpButton = new Button("Ayuda");
		
		VBox vCajaChecks1 = new VBox(5,mayusMinis,regularExp);
		VBox vCajaChecks2 = new VBox(5,searchBackwards,resaltarResult);
		
		HBox cajaChecks = new HBox(5,vCajaChecks1,vCajaChecks2);
		
		HBox cajaIzquierda = new HBox(5,search_label,replace_label,cajaChecks);
		
		VBox cajaBotonesDrecha = new VBox(5,buscar_button,replace_button,replace_all_button,
																	closeButon,helpButton);
		
		GridPane root = new GridPane();
		
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(20));
		root.setGridLinesVisible(false);
		root.addRow(0, cajaIzquierda,cajaBotonesDrecha);
		
		
	}

}
