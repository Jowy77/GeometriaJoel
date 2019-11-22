package dad.javafx.login;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application{
	
	private Label userLabel,passLabel;
	private TextField userText;
	private PasswordField passText;
	private ComboBox<String> authModesCombo;
	private Button loginButton;
	
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		System.out.println(Thread.currentThread());

		
		this.primaryStage = primaryStage;
		
		userLabel = new Label("Usuario");
		userLabel.setMinWidth(80);
		
		passLabel = new Label("Contraseña");
		passLabel.setMinWidth(80);
		
		userText = new TextField();
		userText.setPromptText("Nombre de usuriuo");
		userText.setMaxWidth(80);
		
		passText = new PasswordField();
		passText.setPromptText("Contraseña");
		passText.setMaxWidth(80);
		
		authModesCombo = new ComboBox<String>();
		authModesCombo.getItems().addAll("Cuenta local","LDAP","Base de datos");
		authModesCombo.setPromptText("Modo de autenticacion");

		
		HBox userbox= new HBox(5,userLabel,userText);
		userbox.setAlignment(Pos.CENTER);
		HBox passbBox= new HBox(5,passLabel,passText);
		passbBox.setAlignment(Pos.CENTER);
		
		
		loginButton = new Button("Acceder");
		loginButton.setDefaultButton(true);
		loginButton.setOnAction(e-> onLoginButtonAction(e));
		
		HBox autBox = new HBox(5,authModesCombo,loginButton);
		autBox.setAlignment(Pos.CENTER);
		
		VBox root = new VBox(5,userbox,passbBox,autBox);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root,320,200);
		
		primaryStage.setTitle("Iniciar Sesion");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println("Parando java FX");
	}
	
	private void onLoginButtonAction(ActionEvent e) {
		String username = userText.getText();
		String passwaord = passText.getText();
		String auth = authModesCombo.getSelectionModel().getSelectedItem();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.initOwner(primaryStage);
		alert.setHeaderText("Intento de innicio de sesion");
		alert.setContentText(
						"Usuasio: "+ username+"\n"+
						"Contraseñ: "+ passwaord +"\n"+
						"Modo de autenticacion: " + auth + "\n");
		
		alert.showAndWait();
		
		Platform.exit();
		
	}

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread());
		launch(args);
	}

}
