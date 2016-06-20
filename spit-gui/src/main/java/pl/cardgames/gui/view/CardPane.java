package pl.cardgames.gui.view;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import pl.cardgames.gui.view.util.CardFactory;
import pl.cardgames.gui.view.util.TempStaticCardFactory;
import pl.cardgames.spit.common.cards.Card;

public class CardPane extends Pane {
    private final CardFactory factory = new CardFactory();
    private final Card card;
    private boolean frontSide;

    private Group front;
    private Group back;

    public CardPane() {
        this.card = null;
    }

    public CardPane(Card card) {
        this.front = TempStaticCardFactory.produceFront(card.getCode());
        this.back = TempStaticCardFactory.produceBack();
        this.front.setLayoutY(0d);
        this.front.setLayoutX(0d);
        this.card = card;
        this.getChildren().add(front);
        frontSide = true;
        this.setScaleX(0.5);
        this.setScaleY(0.5);
    }

    public void flip() {
        this.getChildren().remove(0);
        if (frontSide) {
            this.getChildren().add(back);
            this.frontSide = false;
        } else {
            this.getChildren().add(front);
            this.frontSide = true;
        }

    }
}
