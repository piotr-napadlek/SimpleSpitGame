package pl.cardgames.gui.controller.util;

import javafx.scene.Scene;
import javafx.stage.Stage;

public interface Controller extends ParentAware<Controller>, ChildrenAware<Controller> {
	void setStage(Stage stage);
	Stage getStage();
	void setScene(Scene scene);
	Scene getScene();
}
