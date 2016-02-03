package pl.cardgames.spit.common.cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

	public List<Card> deck;
	public List<List<Card>> playersCards;
	boolean shuffled = false;

	Deck() {
		deck = new ArrayList<>(52);
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(rank, suit));
			}
		}
	}

	public void showDeck() {
		for (Card i : deck) {
			System.out.println(i.getSuit() + " " + i.getRank());

		}

	}

	public boolean shuffle(Collection<Card> deck) {

		if (deck.size() > 2) {

			Collections.shuffle((List<Card>) deck);

			return true;
		} else {

			return false;
		}

	}

	public void startShuffle() {

		shuffled = shuffle(this.deck);

	}

	public void dealer(int numberOfPlayers) {

		if ((numberOfPlayers % 2) == 0) {
			playersCards = new ArrayList<List<Card>>(numberOfPlayers);
			int splitOfCards = deck.size() / numberOfPlayers;

			for (int i = 0; i < numberOfPlayers; i++) {
				playersCards.add(new ArrayList<Card>(splitOfCards));
				for (int j = 0; j < splitOfCards; j++) {
					playersCards.get(i).add(new Card(deck.get(j + i * splitOfCards).getRank(),
							deck.get(j + i * splitOfCards).getSuit()));

				}
			}

		} else {
		}

	}

}
