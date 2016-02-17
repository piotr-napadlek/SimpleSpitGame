package pl.cardgames.split.common.gamecontrol;

import static org.junit.Assert.*;

import org.junit.Test;

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
	
	public void movingCardFromPlayerToTableStock() {
		// given
		Table table = new Table("Player 1", "Player 2");
		
		//when
		table.moveCardToTableStock(table.getPlayer1().getTable().get(0), 0);
		table.moveCardToTableStock(table.getPlayer1().getTable().get(0), 0); //should do nothing
		
		table.moveCardToTableStock(table.getPlayer1().getTable().get(2), 1);
		table.moveCardToTableStock(table.getPlayer1().getTable().get(2), 1);
		
		// then
		assertEquals(0, table.getPlayer1().getTable().get(0).size());
		assertEquals(2, table.getStockCardsOnTable().get(0).size());
		
		assertEquals(1, table.getPlayer1().getTable().get(2).size());
		assertEquals(3, table.getStockCardsOnTable().get(1).size());

	}

}
