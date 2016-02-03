package pl.cardgames.spit.common.cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deckCards;

	public Deck(List<Card> deckCards) {
		this.deckCards = deckCards;
	}

	public Deck() {
		initializeDeck();
		shuffle();
	}

	private void initializeDeck() {
		deckCards = new ArrayList<>(52);
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deckCards.add(new Card(rank, suit));
			}
		}
	}

	public void showDeck() {
		for (Card i : deckCards) {
			System.out.println(i.getSuit() + " " + i.getRank());
		}
	}

	private void shuffle() {
		shuffle(this.deckCards);
	}

	public boolean shuffle(Collection<Card> deck) {
		Collections.shuffle((List<Card>) deck);
		return false;
	}

	public List<List<Card>> dealer(int numberOfPlayers) {
		List<List<Card>> playersCards = new ArrayList<List<Card>>(numberOfPlayers);
		if ((numberOfPlayers % 2) == 0) {
			int splitOfCards = deckCards.size() / numberOfPlayers;

			for (int i = 0; i < numberOfPlayers; i++) {
				playersCards.add(new ArrayList<Card>(splitOfCards));
				for (int j = 0; j < splitOfCards; j++) {
					playersCards.get(i)
							.add(new Card(deckCards.get(j + i * splitOfCards).getRank(),
									deckCards.get(j + i * splitOfCards).getSuit()));

				}
			}
		}
		return playersCards;
	}

	public List<Card> getDeckCards() {
		return deckCards;
	}

	public void setDeckCards(List<Card> deckCards) {
		this.deckCards = deckCards;
	}
}
