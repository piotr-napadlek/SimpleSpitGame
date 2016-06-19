package pl.cardgames.gui.view;

import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import pl.cardgames.spit.common.cards.Card;

public class CardPane extends StackPane {
    private final CardFactory factory = new CardFactory();
    private final Card card;

    private Group front;
    private Group back;

    public CardPane() {
        this.card = null;
    }

    public CardPane(Card card) {
        this.front = new CardFactory().produceFront(card.getCode());
        //this.back = new CardFactory().produceBack();
        this.card = card;
        this.getChildren().add(front);
    }
}
