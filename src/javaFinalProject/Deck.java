package javaFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//creating the cards list
	
	List<Card> cards = new ArrayList<Card>();
	
	//Creating the Suits array
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	//Creating the Rank array
	String[] rank = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King","Ace"};
	
	//Constructor to create card
	public Deck() {
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				cards.add(new Card(rank[j] + " of " + suits[i], i+2));
			}
		}
	}
	
	//shuffle cards
	public void Shuffle() {
		Collections.shuffle(cards);
	}
	
	//draw cards
	public Card Draw() {
		Card draw = cards.get(0);
		cards.remove(0);
		return draw;
	}
	
	public List<Card> getDeck(){
		return cards;
	}
	
	

}
