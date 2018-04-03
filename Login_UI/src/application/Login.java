package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {
	private Scene scene;

	public Login(Stage stage) {

		// Top bar
		BorderPane root = new BorderPane();
		Button backBtn = new Button("<   Back");
		backBtn.setStyle("-fx-background-color: transparent;");
		backBtn.setTextFill(Color.WHITE);
		Text notMember = new Text("Not a member?");
		notMember.setFill(Color.WHITE);
		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setStyle("-fx-border-color: white; -fx-background-color: transparent; -fx-font-weight: bold;");
		signUpBtn.setPadding(new Insets(10, 20, 10, 20));
		signUpBtn.setTextFill(Color.WHITE);

		HBox signUpBox = new HBox(20);
		Region r = new Region();
		HBox.setHgrow(r, Priority.ALWAYS);
		signUpBox.getChildren().addAll(backBtn, r, notMember, signUpBtn);
		signUpBox.setAlignment(Pos.CENTER);

		root.setTop(signUpBox);
		root.setMargin(signUpBox, new Insets(10));

		// Center
		TextField usernameField = new TextField("Username");
		usernameField.setMaxWidth(250);
		PasswordField passwordField = new PasswordField();
		passwordField.setText("Password");
		passwordField.setMaxWidth(250);
		Button loginBtn = new Button("Login");
		loginBtn.setMaxWidth(250);
		loginBtn.setStyle("-fx-background-color: #A3B2B7; -fx-text-color: #6A7C7E");

		VBox centerBox = new VBox(10);
		centerBox.getChildren().addAll(usernameField, passwordField, loginBtn);
		centerBox.setAlignment(Pos.CENTER);

		root.setCenter(centerBox);

		root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #263437, 	#648B8D)");
		scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.setTitle("Login");
		stage.setResizable(false);
		stage.show();

	}

}
