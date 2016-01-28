package pl.cardgames.spit.shuffler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ShufflerTest {

	private Shuffler<Integer> shuffler;

	@Before
	public void setUp() {
		// assign shuffler here
		// ie. shuffler = new ShufflerImpl();
		shuffler = new ShufflerImpl();
	}

	@Test
	// @Ignore // delete when implemented
	public void shouldShufflePortionOfInts() {
		// given
		Collection<Integer> ints = IntStream.range(3, 1105).boxed().collect(Collectors.toList());
		Collection<Integer> intsSorted = new ArrayList<>(ints);
		// when
		boolean changed = shuffler.shuffle(intsSorted);

		// then
		Assert.assertTrue(changed);
		Assert.assertNotNull(intsSorted);
		Assert.assertFalse(ints.equals(intsSorted));
	}

	@Test
	public void shouldHandleShufflingSingleInt() {
		// given
		Collection<Integer> ints = IntStream.range(1, 2).boxed().collect(Collectors.toList());
		Collection<Integer> intsSorted = new ArrayList<>(ints);
		// when
		boolean changed = shuffler.shuffle(intsSorted);
		// then
		Assert.assertFalse(changed);
		Assert.assertNotNull(intsSorted);
		Assert.assertTrue(ints.equals(intsSorted));
	}

	@Test
	public void sophisticatedTest() {
		// It isn't the sophisticated test. I wrote it to visualize the result
		// of "shuffle method".
		// Yes, It will be removed in the future ;)

		// given
		Collection<Integer> ints = IntStream.range(3, 1105).boxed().collect(Collectors.toList());
		Collection<Integer> intsSorted = new ArrayList<>(ints);

		Integer[] arrayInts = ints.toArray(new Integer[ints.size()]);

		// when
		shuffler.shuffle(intsSorted);
		Integer[] arraySorted = intsSorted.toArray(new Integer[intsSorted.size()]);

		// then
		Assert.assertNotEquals(arrayInts, arraySorted);

		// the result in the console
		for (int i = 0; i < arrayInts.length; i++) {
			System.out.println(arrayInts[i] + " potasowaniu " + arraySorted[i]);

		}
	}
}
