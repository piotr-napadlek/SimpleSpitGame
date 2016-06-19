package pl.cardgames.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import pl.cardgames.gui.controller.util.ControllerBase;
import pl.cardgames.gui.view.CardPane;
import pl.cardgames.spit.common.cards.Card;
import pl.cardgames.spit.common.cards.Rank;
import pl.cardgames.spit.common.cards.Suit;

import java.io.IOException;

public class MainViewController extends ControllerBase {
    private final Delta delta = new Delta();

    @FXML
    private AnchorPane cardContainer;

    @FXML
    private void initialize() throws IOException {

        StackPane card = new CardPane(new Card(Rank.KING, Suit.CLUB));
        cardContainer.getChildren().add(card);

        defineDragHandler(card);
    }

    private void defineDragHandler(final StackPane card) {
        card.setOnMousePressed(event -> {
            delta.x = card.getLayoutX() - event.getSceneX();
            delta.y = card.getLayoutY() - event.getSceneY();
        });
        card.setOnMouseDragged(event -> {
            card.setLayoutX(event.getSceneX() + delta.x);
            card.setLayoutY(event.getSceneY() + delta.y);
        });
    }

    private class Delta {
        private double x, y;
    }
}
