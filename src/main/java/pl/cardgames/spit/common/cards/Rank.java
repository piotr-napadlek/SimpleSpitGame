package pl.cardgames.spit.common.cards;

import java.util.*;

public enum Rank {
	TWO(2, '2'), 
	THREE(3, '3'), 
	FOUR(4, '4'), 
	FIVE(5, '5'), 
	SIX(6,'6'), 
	SEVEN(7, '7'),
	EIGHT(8, '8'),
	NINE(9, '9'), 
	TEN(10, 'T'), 
	JACK(11,'J'), 
	QUEEN(12, 'Q'), 
	KING(13, 'K'), 
	ACE(14, 'A');

	private int cardValue;
	private char rankCharacter;
	private final static Map<Character, Rank> rankMap = 
			new HashMap<Character, Rank>(Rank.values().length + 1, 1.0f);
	static {
		for(Rank rank : Rank.values()) {
			rankMap.put(rank.asChar(), rank);
		}
	}
	
	Rank(int value, char character) {
		this.cardValue = value;
		this.rankCharacter = character;
	}

	public int asInt() {
		return cardValue;
	}

	public char asChar() {
		return rankCharacter;
	}
	
	public static Rank fromChar(char rankChar) {
		return rankMap.get(rankChar);
	}
}