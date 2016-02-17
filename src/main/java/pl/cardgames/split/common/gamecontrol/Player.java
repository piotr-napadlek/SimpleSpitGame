package pl.cardgames.split.common.gamecontrol;

import pl.cardgames.spit.common.cards.Card;
import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private List<List<Card>> table; //5 stock of cards (1st stock - one card, 2nd two cards, .. 5th five card)
	private String playerName;
	private int quantityOfCards;

	public Player(List<Card> deckCards, String name) {
		setPlayerName(name);
		setQuantityOfCards(deckCards.size());
		initializeHandCards(deckCards);
		initializeTableCards(deckCards);

	}
	
	private void initializeHandCards(List<Card> deckCards){
		hand = new ArrayList<Card>(11);
		hand = assignHandPlayerCards(deckCards);
	}
	
	private void initializeTableCards(List<Card> deckCards){
		table = new ArrayList<List<Card>>(5);
		table = assign5StocksOfCards(deckCards);
	}
	

	public List<Card> assignHandPlayerCards(List<Card> deckCards) {
		for (int i = 0; i < 11; i++) {
			hand.add(deckCards.get(i));
		}
		return hand;
	}

	public List<List<Card>> assign5StocksOfCards(List<Card> deckCards) {
		int deckCardsNumber = 11;
		for (int i = 0; i < 5; i++) {
			table.add(new ArrayList<Card>(i + 1));
			for (int j = 0; j < i+1; j++) {
				table.get(i).add(deckCards.get(deckCardsNumber));
				deckCardsNumber++;
			}
		}
		return table;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public List<List<Card>> getTable() {
		return table;
	}

	public void setTable(List<List<Card>> table) {
		this.table = table;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getQuantityOfCards() {
		return quantityOfCards;
	}

	public void setQuantityOfCards(int quantityOfCards) {
		this.quantityOfCards = quantityOfCards;
	}

}
