package pl.cardgames.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import pl.cardgames.gui.controller.util.ControllerBase;
import pl.cardgames.gui.view.CardPane;
import pl.cardgames.spit.common.cards.Card;
import pl.cardgames.spit.common.cards.Rank;
import pl.cardgames.spit.common.cards.Suit;

import java.io.IOException;

public class MainViewController extends ControllerBase {
    private final Delta delta = new Delta();

    @FXML
    public Pane computerDeck;
    @FXML
    public Pane playerDeck;

    @FXML
    private AnchorPane cardContainer;

    @FXML
    private void initialize() throws IOException {

        CardPane card = new CardPane(new Card(Rank.ACE, Suit.CLUB));
        playerDeck.getChildren().add(card);

        defineDragHandler(card);
    }

    private void defineDragHandler(final Pane card) {
        card.setOnMousePressed(event -> {
            delta.x = card.getLayoutX() - event.getSceneX();
            delta.y = card.getLayoutY() - event.getSceneY();
            card.setCursor(Cursor.MOVE);
        });
        card.setOnMouseDragged(event -> {
            card.setLayoutX(event.getSceneX() + delta.x);
            card.setLayoutY(event.getSceneY() + delta.y);
        });
        card.setOnMouseReleased(event -> card.setCursor(Cursor.DEFAULT));
    }

    private class Delta {
        private double x, y;
    }
}
