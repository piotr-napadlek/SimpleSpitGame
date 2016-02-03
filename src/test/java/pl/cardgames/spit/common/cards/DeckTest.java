package pl.cardgames.spit.common.cards;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

	@Test
	public void dealerDeckTest() {
		// given
		Deck deck2players = new Deck();
		// then
		List<List<Card>> cardsDealt = deck2players.dealer(2);
		// when
		Assert.assertEquals(26, cardsDealt.get(0).size());
		Assert.assertTrue(cardsDealt.get(0).size() == cardsDealt.get(1).size());
		
		Assert.assertFalse(cardsDealt.get(0).equals(cardsDealt.get(1)));
		Assert.assertEquals(cardsDealt.get(0).get(2), deck2players.getDeckCards().get(2));
		Assert.assertEquals(cardsDealt.get(1).get(2), deck2players.getDeckCards().get(2 + 26));
	}
}
