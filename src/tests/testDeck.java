package tests;

import objects.Card;
import objects.Deck;

public class testDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card("Hearts","2");
		System.out.println(card1.toString());
		System.out.println("--------------------------");
		
		Deck deck1 = new Deck();	
		System.out.println(deck1.toString());
		System.out.println("--------------------------");
		
		deck1.shuffle();
		System.out.println(deck1.toString());
		
		int counter = 0; 
		int maxnum = 52;
		
		while(counter<maxnum) {
			Card returnedCard = deck1.getCard();
			System.out.println("CARD: "+ returnedCard);
			//System.out.println(String.valueOf(deck1.getDeckOfCards().length));
			counter++;
		}
		
		deck1.shuffle();
		System.out.println(deck1.toString());
		
	}

}
