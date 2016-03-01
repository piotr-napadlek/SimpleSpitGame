package pl.cardgames.gui.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.layout.AnchorPane;
import pl.cardgames.gui.controller.util.ControllerBase;

public class MainViewController extends ControllerBase {

	@FXML
	private AnchorPane cardContainer;

	@FXML
	private void initialize() throws IOException {
		cardContainer.getChildren().add(
				FXMLLoader.load(this.getClass().getResource("/pl/cardgames/gui/img/ad.fxml")));
		cardContainer.setMaxHeight(88);
		cardContainer.setPrefHeight(88);
		cardContainer.autosize();
		
		cardContainer.setOnMouseDragged(mouseEvent -> {
			cardContainer.setCursor(Cursor.MOVE);
			cardContainer.setLayoutX(mouseEvent.getSceneX());
			cardContainer.setLayoutY(mouseEvent.getSceneY());
		});
	}
}
