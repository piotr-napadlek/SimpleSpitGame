package pl.cardgames.gui.view.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;

import java.io.IOException;

public class CardFactory {
    private static final FrontType DEFAULT_FRONT = FrontType.STANDARD;
    private static final BackType DEFAULT_BACK = BackType.DRAWING_GREEN;

    private FrontType frontType = DEFAULT_FRONT;
    private BackType backType = DEFAULT_BACK;

    private Group fronts;
    private Group backs;

    public CardFactory() {
    }

    public CardFactory(FrontType frontType) {
        this.frontType = frontType;
    }

    public CardFactory(BackType backType) {
        this.backType = backType;
    }

    public CardFactory(FrontType frontType, BackType backType) {
        this.frontType = frontType;
        this.backType = backType;
    }

    public FrontType getFrontType() {
        return frontType;
    }

    public BackType getBackType() {
        return backType;
    }

    public void setBackType(BackType backType) {
        this.backType = backType;
    }

    public void setFrontType(FrontType frontType) {
        this.frontType = frontType;
    }

    public Group produceFront(String cardCode) {
        validateFronts();
        return (Group) fronts.lookup("#" + cardCode);
    }

    public Group produceBack() {
        validateBacks();
        return (Group) backs.lookup("#" + backType.getId());
    }

    private void validateBacks() {
        if (backs == null || backs.getChildren().size() == 0) {
            try {
                this.backs = FXMLLoader.load(backType.getFxmlUrl());
            } catch (IOException e) {
                e.printStackTrace();
                this.backs = new Group();
            }
        }
    }

    private void validateFronts() {
        if (fronts == null || fronts.getChildren().size() == 0) {
            try {
                this.fronts = FXMLLoader.load(frontType.getFxmlURL());
            } catch (IOException e) {
                e.printStackTrace();
                this.fronts = new Group();
            }
        }
    }
}
