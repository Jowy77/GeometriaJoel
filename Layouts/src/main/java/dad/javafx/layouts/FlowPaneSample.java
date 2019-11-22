package dad.javafx.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		
		root.setAlignment(Pos.CENTER);
		root.setHgap(0);
		root.setVgap(0);
		root.setPadding(new Insets(5));
		
		for(int i=0 ; i<50 ;i++) {
			root.getChildren().add(new Button("Boton "+ i));
		}
		
		Scene scene = new Scene(root, 640,480);
		
		primaryStage.setTitle("Ejemplo flowPane");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main (String [] args) {
		launch(args);
	}

}
