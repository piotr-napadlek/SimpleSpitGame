package pl.cardgames.split.common.gamecontrol;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.cardgames.spit.common.cards.Card;

public class TableTest {

	@Test
	public void shouldCorrectlyCreateTable() {
		// given and when
		Table table = new Table("Player 1", "Player 2");
		// then
		assertEquals(10, table.getPlayer1().getHand().size());
		assertEquals(10, table.getPlayer2().getHand().size());
		assertEquals(2, table.getStockCardsOnTable().size());
		assertEquals(1, table.getStockCardsOnTable().get(0).size());
		assertEquals(1, table.getStockCardsOnTable().get(1).size());
	}

	@Test
	public void movingCardFromPlayerTableToTableStock() {
		// given
		Table table = new Table("Player 1", "Player 2");

		// when
		table.moveCardToTableStock(table.getPlayer1().getTable().get(0), 0);
		table.moveCardToTableStock(table.getPlayer1().getTable().get(0), 0); // should
																				// do
																				// nothing

		table.moveCardToTableStock(table.getPlayer1().getTable().get(2), 1);
		table.moveCardToTableStock(table.getPlayer1().getTable().get(2), 1);
		// System.out.println(table.getPlayer1().getTable().get(2).indexOf(o));
		// then
		assertEquals(0, table.getPlayer1().getTable().get(0).size());
		assertEquals(2, table.getStockCardsOnTable().get(0).size());

		assertEquals(1, table.getPlayer1().getTable().get(2).size());
		assertEquals(3, table.getStockCardsOnTable().get(1).size());

	}

	@Test
	public void movingCardFromPlayerHandToTableStock() {
		// given
		Table table = new Table("Player 1", "Player 2");
		Card card = new Card(table.getPlayer1().getHand().get(5).getRank(),
				table.getPlayer1().getHand().get(5).getSuit());

		// when
		table.moveCardFormPlayerHandToTableStock(table.getPlayer1().getHand(),
				table.getPlayer1().getHand().indexOf(table.getPlayer1().getHand().get(5)), 0);

		// then
		assertEquals(2, table.getStockCardsOnTable().get(0).size());
		assertEquals(9, table.getPlayer1().getHand().size());
		assertTrue(table.getStockCardsOnTable().get(0).get(1).equals(card));
	}

}
