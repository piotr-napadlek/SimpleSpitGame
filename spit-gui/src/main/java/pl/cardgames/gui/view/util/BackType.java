package pl.cardgames.gui.view.util;

import java.net.URL;

public enum BackType {
    STANDARD("standard_red"),
    DRAWING_GREEN("drawing_green");

    private static final String BACKS_PATH = "/pl/cardgames/gui/img/backs.fxml";
    private String id;

    BackType(String id) {
        this.id = id;
    }

    public URL getFxmlUrl() {
        return this.getClass().getResource(BACKS_PATH);
    }

    public String getId() {
        return this.id;
    }
}
