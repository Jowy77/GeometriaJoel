package dad.fx.CalculadoraCompleja;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraComplejaApp extends Application {
	
	TextField operando1;
	TextField operando2;
	TextField operando3;
	TextField operando4;
	TextField resultado1;
	TextField resultado2;
	ComboBox<String> operacionesCombo;
	Label suma,imaginario;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		operando1 = new TextField();
		operando1.setText("0");
		operando1.setLayoutX(100000);
		
		
		operando2 = new TextField();
		operando2.setText("0");
		
		operando3 = new TextField();
		operando3.setText("0");
		
		operando4 = new TextField();
		operando4.setText("0");
		
		resultado1 = new TextField();
		resultado1.setText("0");
		resultado1.setDisable(true);
		
		resultado2 = new TextField();
		resultado2.setText("0");
		resultado2.setDisable(true);
		
		operacionesCombo = new ComboBox<String>();
		operacionesCombo.getItems().addAll("+","-","*","/");
		
		Separator miSeparador = new Separator();
		
		VBox comboBox = new VBox();
		comboBox.setSpacing(5);
		comboBox.setAlignment(Pos.CENTER_LEFT);
		comboBox.getChildren().addAll(operacionesCombo);
		
		VBox cajaParaNumerosYResultados = new VBox();
		cajaParaNumerosYResultados.setSpacing(5);
		cajaParaNumerosYResultados.setAlignment(Pos.CENTER);
		
		
		HBox operacion1Box = new HBox(5,operando1,operando2,new Label(" i"));
		operacion1Box.setAlignment(Pos.CENTER);
		HBox operacion2Box = new HBox(5,operando3,operando4,new Label(" i"));
		operacion2Box.setAlignment(Pos.CENTER);
		HBox resultadosBox = new HBox(5,resultado1,resultado2, new Label(" i"));
		resultadosBox.setAlignment(Pos.CENTER);
		
		cajaParaNumerosYResultados.getChildren().addAll(operacion1Box,operacion2Box,miSeparador,resultadosBox);
		
		HBox root = new HBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(comboBox,cajaParaNumerosYResultados);
		
		Scene scene = new Scene(root,320,200);
		
		primaryStage.setTitle("CalCuladora Compleja");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}
	
	public static void main (String [] args) {
		launch(args);
	}

}
