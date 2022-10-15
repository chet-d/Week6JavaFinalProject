package javaFinalProject;

public class App {

	public static void main(String[] args) {

		//Instantiate a deck and two players
		Deck deck = new Deck();
		Player player1 = new Player("Tom");
		Player player2 = new Player("Jerry");
		
		System.out.println("There are two players in this game: " + "\n" + "Player 1: " + player1.getName() + "\n" + "Player 2: " + player2.getName() );
		
		deck.Shuffle(); //calling shuffle method
		
		for(int i = 0; i < 52; i++) { //Traditional loop to iterate through the deck 
			if(i % 2 == 0) {
				player1.draw(deck); 
			}else {
				player2.draw(deck);
			}
		}
		
		//prints out each players hand
		player1.describe();
		player2.describe();
		
		
		System.out.println("------------------------------");
		System.out.println("         TURN RESULTS         ");
		
		//iterates 26 times and calls the flip method for each player
		for(int j = 0; j<26; j++) {
			Card player1Cards = player1.flip(); //flip method for player 1
			Card player2Cards = player2.flip(); //flip method for player 2
			
			//calls increments method for player with higher score
			if(player1Cards.getValue() > player2Cards.getValue()) {
				player1.incrementScore();
				
				System.out.println("------------------------------");
				System.out.println( j+1 +": " + player1.getName() + " wins this turn");
				System.out.println("The updated score is: " + "\n" + player1.getName() + ": " + player1.getScore() + "\n" + player2.getName() + ": " + player2.getScore());
				System.out.println("------------------------------");
			}else{
				player2.incrementScore();
				System.out.println("------------------------------");
				System.out.println(j+1 +": " + player2.getName() + " wins this turn");
				System.out.println("The updated score is: " + "\n" + player2.getName() + ": " + player2.getScore() + "\n" + player1.getName() + ": " + player1.getScore());
				System.out.println("------------------------------");
			}
			
		}
		
		
		
		System.out.println("-----------------------" + "FINAL SCORE"+ "---------------------------");
		System.out.println("-------------------------------------------------------------");
		
		
		//Compares score for each player and prints winner, loser, or draw
		if(player1.getScore()> player2.getScore()) {
			System.out.println(player1.getName()+ " wins with a FINAL score of " + player1.getScore() + "\n" + player2.getName() + " loses with a FINAL score of " + player2.getScore());
		}else if(player1.getScore()< player2.getScore()) {
			System.out.println(player2.getName()+ " wins with a FINAL score of " + player2.getScore()+"\n" + player1.getName() + " loses with a FINAL score of " + player1.getScore());
		}else {
			System.out.println("The game is a tie. Each player has a FINAL score of " + player1.getScore() + " and " + player2.getScore());
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");

	}

}
