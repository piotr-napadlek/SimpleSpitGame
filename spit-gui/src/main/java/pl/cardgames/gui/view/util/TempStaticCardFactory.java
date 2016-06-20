package pl.cardgames.gui.view.util;

import javafx.scene.Group;

public class TempStaticCardFactory {
    private static final CardFactory CARD_FACTORY = new CardFactory();

    public static Group produceFront(String cardCode) {
        return CARD_FACTORY.produceFront(cardCode);
    }

    public static Group produceBack() {
        return CARD_FACTORY.produceBack();
    }
}
