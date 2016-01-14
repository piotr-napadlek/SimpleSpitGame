package pl.cardgames.spit.shuffler;

import java.util.Collection;

public interface CardShuffler<T> extends Shuffler<T>{
	Collection<T> shuffleWholeDeck();
}
