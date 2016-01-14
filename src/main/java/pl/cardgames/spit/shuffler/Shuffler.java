package pl.cardgames.spit.shuffler;

import java.util.Collection;

import pl.cardgames.spit.common.cards.Card;

public interface Shuffler<T> {
	public Collection<T> shuffle(Collection<T> items);
}
