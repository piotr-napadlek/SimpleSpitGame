package pl.cardgames.gui.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import pl.cardgames.gui.controller.util.ControllerBase;
import pl.cardgames.gui.view.CardFactory;

public class MainViewController extends ControllerBase {
	private CardFactory cardFactory = new CardFactory();
	
	@FXML
	private AnchorPane cardContainer;

	@FXML
	private void initialize() throws IOException {

		StackPane card = new StackPane(cardFactory.produceFront("kd"));
		cardContainer.getChildren().add(card);
		
		cardContainer.setOnMouseDragged(mouseEvent -> {
			cardContainer.setCursor(Cursor.MOVE);
			cardContainer.setLayoutX(mouseEvent.getSceneX());
			cardContainer.setLayoutY(mouseEvent.getSceneY());
		});
	}
}
