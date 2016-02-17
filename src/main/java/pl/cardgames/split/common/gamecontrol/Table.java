package pl.cardgames.split.common.gamecontrol;

import pl.cardgames.spit.common.cards.Card;
import pl.cardgames.spit.common.cards.Deck;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private List<List<Card>> stockCardsOnTable;
	private Player player1;
	private Player player2;

	public Table(String player1Name, String player2Name) {
		initializePlayers(player1Name, player2Name);
		initializeStockCardsOnTable();
	}

	private void initializePlayers(String player1Name, String player2Name) {
		Deck deck = new Deck();
		deck.dealer(2);

		player1 = new Player(deck.dealer(2).get(0), player1Name);
		player2 = new Player(deck.dealer(2).get(1), player2Name);
	}

	private void initializeStockCardsOnTable() {
		stockCardsOnTable = new ArrayList<List<Card>>(2);
		stockCardsOnTable.add(new ArrayList<Card>(1));
		stockCardsOnTable.add(new ArrayList<Card>(1));

		moveCardToTableStock(player1.getHand(), 0);
		moveCardToTableStock(player2.getHand(), 1);
	}

	// it moves a last card from a Player list to a Table stock. After that the
	// last card is removed.
	public List<Card> moveCardToTableStock(List<Card> cardToMove, int stockNumber) {
		if (cardToMove.isEmpty() == false && (stockNumber == 0 || stockNumber == 1)) {
			stockCardsOnTable.get(stockNumber).add(cardToMove.get(cardToMove.size() - 1));
			cardToMove.remove(cardToMove.size() - 1);
		}
		return cardToMove;
	}

	public List<List<Card>> getStockCardsOnTable() {
		return stockCardsOnTable;
	}

	public void setStockCardsOnTable(List<List<Card>> stockCardsOnTable) {
		this.stockCardsOnTable = stockCardsOnTable;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

}
