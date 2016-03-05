package pl.cardgames.gui.view;

import java.net.URL;

public enum FrontType {
	STANDARD("standard_fronts.fxml"),
	GRAYSCALE("grayscale_fronts.fxml");
	
	private static final String FRONT_PATHS = "/pl/cardgames/gui/img/";
	private String fxml;
	
	FrontType(String fxmlName) {
		this.fxml = fxmlName;
	}
	
	public URL getFxmlURL() {
		return this.getClass().getResource(FRONT_PATHS.concat(fxml));
	}
}
