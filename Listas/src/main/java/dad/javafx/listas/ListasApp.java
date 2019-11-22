package dad.javafx.listas;

import java.util.Optional;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListasApp extends Application {
	
	//model
	
	private ListProperty<String> nombres = new SimpleListProperty<String>(FXCollections.observableArrayList());
	
	private IntegerProperty seleccionados = new SimpleIntegerProperty();
	
	//view
	
	private ListView<String> nombresListView;
	private Button anadirButton,quitarButton;

	@Override
	public void start(Stage primaryStage) throws Exception {
		nombresListView = new ListView<String>();
		
		nombresListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		anadirButton = new Button("Añadir");
		
		quitarButton= new Button("Quitar");
		
		HBox botonesBox= new HBox(5,anadirButton,quitarButton);
		botonesBox.setAlignment(Pos.BASELINE_RIGHT);
		
		BorderPane root = new BorderPane();
		root.setCenter(nombresListView);
		root.setBottom(botonesBox);
		root.setPadding(new Insets(5));
		
		Scene scene = new Scene(root,640,480);
		
		primaryStage.setTitle("Listas");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//listeners y bindeos
		
		quitarButton.disableProperty().bind(nombresListView.getSelectionModel().selectedItemProperty().isNull());
		
		nombresListView.itemsProperty().bind(nombres);
		
		
		seleccionados.bind(nombresListView.getSelectionModel().selectedIndexProperty());
		
		anadirButton.setOnAction(e-> onAnadirAction(e));
		
		quitarButton.setOnAction(e-> onQuitarAction(e));
		
	

	}

	private void onAnadirAction(ActionEvent e) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Nuevo nombre");
		dialog.setHeaderText("Añadir un nuevo nombre a la lista");
		dialog.setContentText("Nombre:");
		Optional<String> result = dialog.showAndWait();
		if(result.isPresent()) {
			nombres.add(result.get());
		}
		
	}
	
	private void onQuitarAction(ActionEvent e) {
		nombres.remove(seleccionados.get());
	}

	public static void main(String[] args) {
		launch(args);

	}

}
