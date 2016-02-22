package pl.cardgames.spit.common.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class CardTest {

	@Test
	public void shouldCorrectlyCreateCard() {
		// given
		Card card = new Card(Rank.FOUR, Suit.DIAMOND);
		// when
		// then
		assertNotNull(card);
		assertEquals(card.getRank(), Rank.FOUR);
		assertEquals(card.getSuit(), Suit.DIAMOND);
	}
	
	@Test
	public void shouldAssertCardsAreDifferent() {
		// given
		Card firstCard = new Card(Rank.ACE, Suit.HEART);
		Card secondCard = new Card(Rank.ACE, Suit.CLUB);
		// when
		// then
		assertNotEquals(0, firstCard.compareTo(secondCard));
	}
	
	@Test
	public void shouldAssertCardsAreEqual() {
		// given
		Card firstCard = new Card(Rank.TWO, Suit.CLUB);
		Card secondCard = new Card(Rank.TWO, Suit.CLUB);
		// when
		// then
		assertEquals(0, firstCard.compareTo(secondCard));
	}

	@Test
	public void shouldAssertRanksAreEqual() {
		// given
		Card firstCard = new Card(Rank.JACK, Suit.HEART);
		Card secondCard = new Card(Rank.JACK, Suit.CLUB);
		// when
		// then
		assertEquals(0, firstCard.compareRank(secondCard));
	}

	@Test
	public void shouldAssertRanksDifferByOneFirstTest() {
		// given
		Card firstCard = new Card(Rank.QUEEN, Suit.SPADE);
		Card secondCard = new Card(Rank.JACK, Suit.HEART);
		// when
		int expectedRankDifference = 1;
		int actualRankDifference = Math.abs(firstCard.compareRank(secondCard));
		// then
		assertEquals(expectedRankDifference, actualRankDifference);
	}
	
	@Test
	public void shouldAssertRanksDifferByOneSecondTest() {
		// given
		Card firstCard = new Card(Rank.TEN, Suit.SPADE);
		Card secondCard = new Card(Rank.JACK, Suit.HEART);
		// when
		int expectedRankDifference = 1;
		int actualRankDifference = Math.abs(firstCard.compareRank(secondCard));
		// then
		assertEquals(expectedRankDifference, actualRankDifference);
	}
	
	@Test
	public void shouldGetWholeDeckStaticFactoryTest() {
		// given
		List<Card> deck = Card.getWholeDeck();
		// when
		Card first = deck.get(0);
		Card last = deck.get(deck.size() - 1);
		Card jackDiamond = deck.get(37);
		// then
		assertEquals(52, deck.size());
		assertEquals(first.getRank(), Rank.TWO);
		assertEquals(first.getSuit(), Suit.HEART);
		assertEquals(last.getRank(), Rank.ACE);
		assertEquals(last.getSuit(), Suit.SPADE);
		assertEquals(jackDiamond.getRank(), Rank.JACK);
		assertEquals(jackDiamond.getSuit(), Suit.DIAMOND);
	}
}
