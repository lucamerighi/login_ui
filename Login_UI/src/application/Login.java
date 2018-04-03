package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Login {
	private Scene scene;
	
	public Login(Stage stage) {
		// TODO Auto-generated constructor stub
		BorderPane root = new BorderPane();
		Button backBtn = new Button("Back to store");
		Label notMember = new Label("Not a member?");
		Button signUpBtn = new Button("Sign Up");
		
		scene = new Scene(root, 800, 600);
		
		
	}
	
	
}
