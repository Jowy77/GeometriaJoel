package dad.javafx.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class BorderPaneSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*Button norte = new Button("Norte");
		Button sur = new Button("Sur");
		Button este = new Button("Este");
		Button oeste = new Button("Oeste");
		Button centro = new Button("Centro");*/
		Pane norte = new Pane();
		norte.setPrefHeight(25);
		norte.setStyle("-fx-background-color: red");
		Pane sur = new Pane();
		Pane este = new Pane();
		Pane oeste = new Pane();
		Pane centro = new Pane();
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5,20,0,47));
		root.setTop(norte);
		root.setBottom(sur);
		root.setRight(este);
		root.setLeft(oeste);
		root.setCenter(centro);
		
		BorderPane.setAlignment(oeste, Pos.CENTER);
		BorderPane.setAlignment(sur, Pos.CENTER);
		BorderPane.setAlignment(norte, Pos.CENTER);
		BorderPane.setAlignment(este, Pos.CENTER);
		
		Scene scene = new Scene(root,640,480);
		
		primaryStage.setTitle("layaout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String [] args) {
		launch(args);
	}

}
