package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {
	private Scene scene;
	private BorderPane root;

	public Login(Stage stage) {

		// Initialize pane
		root = new BorderPane();
		root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #263437, 	#648B8D)");

		// Top bar
		drawTopBar();

		// Center content
		drawCenterContent();

		scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.setTitle("Login");
		stage.setResizable(false);
		stage.show();

	}

	private void drawTopBar() {

		// Back button
		Button backBtn = new Button("<   Back");
		backBtn.setStyle("-fx-background-color: transparent;");
		backBtn.setTextFill(Color.WHITE);

		// New member text
		Text notMember = new Text("Not a member?");
		notMember.setFill(Color.WHITE);

		// Sign up button
		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setStyle("-fx-border-color: white; -fx-background-color: transparent; -fx-font-weight: bold;");
		signUpBtn.setPadding(new Insets(10, 20, 10, 20));
		signUpBtn.setTextFill(Color.WHITE);

		// Top bar box
		HBox signUpBox = new HBox(20);
		Region r1 = new Region();
		HBox.setHgrow(r1, Priority.ALWAYS);
		signUpBox.getChildren().addAll(backBtn, r1, notMember, signUpBtn);
		signUpBox.setAlignment(Pos.CENTER);

		root.setTop(signUpBox);
		signUpBox.setPadding(new Insets(10));
	}

	private void drawCenterContent() {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		// Logo
		ImageView logo = new ImageView(new Image("file:logo.png", 150, 100, true, true));

		// Username textfield
		Text username = new Text("USERNAME");
		username.setFill(Color.WHITE);
		TextField usernameField = new TextField();
		usernameField.setMaxWidth(250);

		// Password textfield
		Text password = new Text("PASSWORD");
		password.setFill(Color.WHITE);
		PasswordField passwordField = new PasswordField();
		passwordField.setMaxWidth(250);
		passwordField.setStyle("-fx-background-color: transparent");

		// Login button
		Button loginBtn = new Button("Login");
		loginBtn.setMaxWidth(250);
		loginBtn.setStyle("-fx-background-color: #A3B2B7; -fx-text-color: #6A7C7E");

		// Center Box
		VBox centerBox = new VBox(10);
		centerBox.getChildren().addAll(logo, username, usernameField, password, passwordField, loginBtn);
		centerBox.setAlignment(Pos.CENTER);
		
		//9Line line1 = new Line(centerBox.getHeight(), centerBox.getWidth());

		root.setCenter(centerBox);

	}

}
