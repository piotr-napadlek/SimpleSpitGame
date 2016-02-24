package pl.cardgames.gui.controller.util;

import java.util.Collection;

public interface ChildrenAware <T> {
	boolean addChild(T child);
	boolean removeChild(T child);
	Collection<T> getChildren();
}
