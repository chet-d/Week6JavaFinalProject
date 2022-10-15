package javaFinalProject;

import java.util.ArrayList;


public class Player {
	
	//creating list of card in hand array
	ArrayList<Card> hand = new ArrayList<Card>();
	
	private int score;
	private String name;
	
	
	//constructor - sets the score to 0
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	//Prints out info about player and card
	public void describe() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println(name + " has the following cards in his hand: ");
		System.out.println("----------------------------------------------------------");
		for(int i = 0; i < hand.size(); i++) {
			System.out.println(i+1 + ": " +  hand.get(i).describe());
		}
	}
	
	//remove and returns the top card of the hand
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	//Takes the deck as an argument and calls the draw method on the deck, adding the returned card to the hand field
	public void draw(Deck deck) {
		hand.add(deck.Draw());
	}
	
	//increment score
	public void incrementScore() {
		//score += 1;
		setScore(getScore() + 1);
	}
	
	//Getters and Setters

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
