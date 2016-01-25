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
	}
	
	@Test
	@Ignore // delete when implemented
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
	@Ignore
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
}
