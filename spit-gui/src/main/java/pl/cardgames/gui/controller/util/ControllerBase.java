package pl.cardgames.gui.controller.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class ControllerBase implements Controller {
	private Stage stage;
	private Scene scene;
	private Controller parent;
	private Set<Controller> children = new HashSet<>();
	
	@Override
	public boolean addChild(Controller child) {
		if (child.equals(parent)) {
			return false;
		}
		return children.add(child);
	}

	@Override
	public boolean removeChild(Controller child) {
		return children.remove(child);
	}

	@Override
	public Collection<Controller> getChildren() {
		return children;
	}

	@Override
	public Controller getParent() {
		return parent;
	}

	@Override
	public void setParent(Controller parent) {
		if (children.contains(parent)) {
			return;
		}
		this.parent = parent;
	}
	
	@Override
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	@Override
	public Stage getStage() {
		return stage;
	}
	
	@Override
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
	@Override
	public Scene getScene() {
		return scene;
	}
}
