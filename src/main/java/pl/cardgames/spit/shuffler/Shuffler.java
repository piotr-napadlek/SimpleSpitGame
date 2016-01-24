package pl.cardgames.spit.shuffler;

import java.util.Collection;

public interface Shuffler<T> {
	public boolean shuffle(Collection<T> items);
}
