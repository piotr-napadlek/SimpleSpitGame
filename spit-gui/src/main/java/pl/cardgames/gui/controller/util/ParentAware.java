package pl.cardgames.gui.controller.util;

public interface ParentAware <T> {
	T getParent();
	void setParent(T parent);
}
