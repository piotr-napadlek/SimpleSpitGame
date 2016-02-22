package pl.cardgames.split.common.gamecontrol;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.cardgames.spit.common.cards.Deck;

public class PlayerTest {

	@Test
	public void shouldCorrectlyCreatePlayers() {
		Deck deck = new Deck();
		deck.dealer(2);
		// given and when
		Player player1 = new Player(deck.dealer(2).get(0), "Player 1");
		Player player2 = new Player(deck.dealer(2).get(1), "Player 2");

		// then
		assertEquals(11, player1.getHand().size());
		//deal out cards to 5 different size stocks 
		assertEquals(1, player1.getTable().get(0).size());
		assertEquals(2, player1.getTable().get(1).size());
		assertEquals(3, player1.getTable().get(2).size());
		assertEquals(4, player1.getTable().get(3).size());
		assertEquals(5, player1.getTable().get(4).size());
		
		//players cards are not the same
		assertFalse(player2.getHand().equals(player1.getHand()));
		assertFalse(player2.getTable().get(0).equals(player1.getTable().get(0)));
	}
}
