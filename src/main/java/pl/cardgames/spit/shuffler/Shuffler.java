package pl.cardgames.spit.shuffler;

import java.util.Collection;

import pl.cardgames.spit.common.cards.Card;

public interface Shuffler {
	public Collection<Card> shuffleWholeDeck();
	public Collection<Card> shuffleCards(Collection<Card> cards);
}
