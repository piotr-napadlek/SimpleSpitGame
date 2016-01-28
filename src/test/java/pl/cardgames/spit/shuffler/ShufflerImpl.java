package pl.cardgames.spit.shuffler;

import java.util.Collection;

public class ShufflerImpl implements Shuffler<Integer> {

	@Override
	public boolean shuffle(Collection<Integer> items) {

		Integer[] array = items.toArray(new Integer[items.size()]);

		if (array.length > 2) {
			items.clear();
			
			int n = array.length;
			for (int i = 0; i < array.length; i++) {
				// Get a random index of the array past i.
				int random = i + (int) (Math.random() * (n - i));
				// Swap the random element with the present element.
				int randomElement = array[random];
				array[random] = array[i];
				array[i] = randomElement;
			}

			for (int i = 0; i < array.length; i++) {
				items.add(array[i]);
			}

			return true;
		} else {
			
			return false;
		}
	}

}
