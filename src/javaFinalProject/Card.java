package javaFinalProject;

public class Card {
	
	//creating the value and name fields. value: holds 2 to 14 (2 to Ace). name: holds suit
	
	private String name;
	private int value;
	//Constructor
	
	public Card (String name, int value) {
		this.name = name;
		this.value = value;
	
	}
	
	//getters and setters for value and name
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public String describe() {
		
		return name;
	}
}
