package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Login {
	private Scene scene;
	
	public Login(Stage stage) {
		// TODO Auto-generated constructor stub
		BorderPane root = new BorderPane();
		Button backBtn = new Button("< Back to store");
		Label notMember = new Label("Not a member?");
		Button signUpBtn = new Button("Sign Up");		
		
		root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #263437, 	#648B8D)");
		scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
	}
	
	
}
