package cardsWAR;

import java.util.ArrayList;
import java.util.List;

public class Player {

	/*
	 * ************* Step 1. part c. section i. number 1, 2 & 3 (Player) 
	 * 1. hand (List of Card) initializing a new array of cards called hand to represent the
	 * cards in each players hand
	 * 
	 * 2. score (set to 0 in the constructor) 3. name score and name are how we keep
	 * track of the player and score *************
	 */

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	/*
	 * ************** Step 1. part c. section 2. number 1, 2 , 3 & 4 (Player)
	 *  1. describe (prints out information about the player and calls the describe
	 * method for each card in the Hand List)
	 * 
	 * 2. flip (removes and returns the top card of the Hand) similar to the draw
	 * method in deck we are returning the first iteration of hand which is at
	 * position 0
	 * 
	 * 3. draw (takes a Deck as an argument and calls the draw method on the deck,
	 * adding the returned Card to the hand field)
	 * 
	 * 4. incrementScore (adds 1 to the Player’s score field) **************
	 */

	public Player(String newName) {
		name = newName;
		score = 0;
	}

	public String describe() {
		StringBuilder describePlayer = new StringBuilder();
		for (Card card : hand) {
			card.describe();
			describePlayer.append(card);
		}
		return describePlayer.append("My name is Player " + name + " and my score was: " + score).toString();
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}

	public void incrementScore() {
		score++;
	}

	public int getScore() {
		int scoreResults = score;
		return scoreResults;
	}

}