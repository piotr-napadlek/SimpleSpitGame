package pl.cardgames.spit.shuffler;

import java.util.Collection;

public interface Shuffler<T> {
	public Collection<T> shuffle(Collection<T> items);
}
