package dad.javafx.hola.mejorado;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaMundoMejoradoApp extends Application{

	private TextField nombreText;
	private Button saludarButton;
	private Label saludoLabel;
	
	public void start(Stage primaryStage) throws Exception {
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(150);

		saludoLabel = new Label("Aqui saldra el saludo");

		saludarButton = new Button("Saludar");
		saludarButton.setDefaultButton(true);
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));

		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludarButton, saludoLabel);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Hola JavaFX Mejorado");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = nombreText.getText();
		saludoLabel.setText("Hola " + nombre);
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
