package dad.javafx.layouts;



import java.time.LocalDate;
import java.time.Period;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class GridPaneSample extends Application {
	
	
	private TextField nombreText;
	private TextField apellidosText;
	private TextField dniText;
	private DatePicker fechaNaPicker;
	private Label edadLabel;
	private TextField[] ibanText;
	private RadioButton hombreRadio, mujerRadio;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPromptText("Nombre del alumno");
		
		apellidosText = new TextField();
		apellidosText.setPromptText("Apellidos del alumno");
		
		dniText=new TextField();
		dniText.setPromptText("Dni del alumno");
		
		fechaNaPicker = new DatePicker();
		fechaNaPicker.setPromptText("Fecha de nacimiento");
		
		edadLabel= new Label("X años");
		
		ibanText = new TextField[6];
		
		for(int i=0;i<ibanText.length;i++) {
			ibanText[i]=new TextField();
			ibanText[i].setPrefColumnCount(4);
		}
		
		
		hombreRadio = new RadioButton("Hombre");
		mujerRadio = new RadioButton("Mujer");
		
		ToggleGroup sexoGroup = new ToggleGroup();
		sexoGroup.getToggles().addAll(hombreRadio,mujerRadio);
		sexoGroup.getSelectedToggle();
	
		
		GridPane root = new GridPane();
		
		root.setHgap(5);
		root.setVgap(5);
		root.setPadding(new Insets(5));
		root.setGridLinesVisible(false);
		root.addRow(0, new Label("Nombre: "),nombreText);
		root.addRow(1, new Label("Apelldios: "),apellidosText);
		root.addRow(2, new Label("Dni: "),dniText);
		root.addRow(3, new Label("Fehcha nacimiento: "),fechaNaPicker);
		root.addRow(4, new Label("IBAN"),new HBox(5,ibanText));
		root.addRow(5, new Label("Sexo: "),new HBox(5,hombreRadio,mujerRadio));
		
		ColumnConstraints [] cols = {
			new ColumnConstraints(),
			new ColumnConstraints(),
		};
		
		cols[0].setHalignment(HPos.RIGHT);
		cols[1].setFillWidth(false);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setHalignment(HPos.LEFT);
		
		GridPane.setFillWidth(nombreText, true);
		GridPane.setColumnSpan(nombreText, 2);
		
		root.getColumnConstraints().setAll(cols);
		
		Scene scene = new Scene(root,640,480);
		
		primaryStage.setTitle("Ejemplo grif pana");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		/*fechaNaPicker.valueProperty().addListener((o,ov,nv)->{
			Integer edad = Period.between(nv,LocalDate.now().getYear());
		});*/

	}

	public static void main(String[] args) {
		launch(args);

	}

}
