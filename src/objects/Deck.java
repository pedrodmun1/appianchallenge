package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {

	private Card[] deckOfCards;
	private final String[] typesOfCards = {"Hearts","Spades","Diamonds","Clubs"};
	private final String[] valuesOfCards = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	public Card[] getDeckOfCards() {
		return deckOfCards;
	}

	public void setDeckOfCards(Card[] deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	
	public Deck() {
		super();
		shuffle();
	}

	public void shuffle() {
		Card[] cards = new Card[52];
		List<Card> listOfCards = new ArrayList<Card>();
		
		for(int j=0;j<(valuesOfCards.length);j++) {
			for(int i=0;i<(typesOfCards.length);i++) {
				Card currentCard = new Card(typesOfCards[i],valuesOfCards[j]);
				//System.out.println(currentCard +" positions= "+String.valueOf(i)+","+String.valueOf(j));
				listOfCards.add(currentCard);
			}
		}
		
		int counter = 0; 
		while(counter<52) {
			Card currentCard = listOfCards.get(counter);
			Boolean availableSpace = false;		
			
			while(availableSpace==false) {
				int randomNumber = (int)(Math.random()*(52));
				if(cards[randomNumber]==null) {
					cards[randomNumber] = currentCard;
					//System.out.println(String.valueOf(randomNumber));
					availableSpace = true;
				}
			}
			//System.out.println(String.valueOf(counter));
			counter++;
		}
		
		this.setDeckOfCards(cards);
	}
	
	public Card getCard() {
		Card[] cards = this.getDeckOfCards();
		int toIndex = cards.length-1;
		Card returnedCard = cards[toIndex];
		
		Card[] newCards = new Card[toIndex];
		for(int i=0;i<toIndex;i++) {
			newCards[i]=cards[i];
		}
		this.setDeckOfCards(newCards);
		return(returnedCard);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(getDeckOfCards());
	}
	
	
}
