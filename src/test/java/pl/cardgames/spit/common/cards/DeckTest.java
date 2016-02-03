package pl.cardgames.spit.common.cards;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

	@Test
	public void shuffleDeckTest() {

		// given
		Deck deck = new Deck();
		Deck deckNotShuffled = new Deck();
		Boolean shuffled = deck.shuffled;

		// when
		Assert.assertEquals(deck.deck, deckNotShuffled.deck);
		Assert.assertFalse(shuffled);

		// then
		deck.startShuffle();
		shuffled = deck.shuffled;

		// when
		Assert.assertNotEquals(deck.deck, deckNotShuffled.deck);
		Assert.assertTrue(shuffled);

	}

	@Test
	public void dealerDeckTest() {

		// given
		Deck deck2players = new Deck();

		// then
		deck2players.dealer(2);

		// when
		Assert.assertEquals(deck2players.playersCards.get(0).size(), 26);
		Assert.assertEquals(deck2players.playersCards.get(0).size(), deck2players.playersCards.get(1).size());
		Assert.assertNotEquals(deck2players.playersCards.get(0), deck2players.playersCards.get(1));
		Assert.assertEquals(deck2players.playersCards.get(0).get(2), deck2players.deck.get(2));
		Assert.assertEquals(deck2players.playersCards.get(1).get(2), deck2players.deck.get(2 + 26));
	}

}
