package pl.cardgames.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppStarter extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader
				.load(getClass().getResource("/pl/cardgames/gui/views/main-view.fxml"));

		Scene scene = new Scene(root);
		scene.setUserAgentStylesheet(
				getClass().getResource("/pl/cardgames/gui/styles/main.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.setTitle("Spit game");

		primaryStage.show();
	}
}
