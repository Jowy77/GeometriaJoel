package dad.FX.holaMundo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class HolaMundoApp extends Application {
	
	
	public void start(Stage primaryStage) throws Exception{
		
		
		Label saludoLabel = new Label();
		
		saludoLabel.setText("Aqui saldra el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		Button saludarButton = new Button();
		saludarButton.setLayoutX(20);
		saludarButton.setLayoutY(80);
		saludarButton.setText("Hola");
//		saludarButton.setOnAction(new EventHandler<ActionEvent>() {
//			
//			public void handle(ActionEvent event) {
//				System.out.print("hola!!!!");
//					saludoLabel.setText("hola Mundo!!");
//			}
//		});
		
		saludarButton.setOnAction(event -> saludoLabel.setText("hola Mundo!!"));
			
		
		
		Pane root = new Pane();
		root.getChildren().addAll(saludoLabel,saludarButton);
		
		Scene scene = new Scene(root,320,200);
		
		primaryStage.setTitle("hola mundo con javaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String [] args) {
		Application.launch(args);

	}

}
