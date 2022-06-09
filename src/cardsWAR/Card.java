package cardsWAR;

/*
 * ************
 * Coding Steps:
 * For the final project you will be creating an automated version of the classic card game WAR.
 * 1.	Create the following classes.
 * Card, Deck, Player
 * ************
 */


public class Card {
	
	/*
	 * ***************
	 * Step 1. part a. section i. Number 1 & 2
	 * 1.	value (contains a value from 2-14 representing cards 2-Ace)
	 * 2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	 * ***************
	 */
	
    private int value;
    private String name;

    public Card(int value, String name) {
	this.setValue(value);
	this.setName(name);
    }
    
    /*
     * *************
     * Step 1. part a. section ii. number 1 & 2
     * 1.	Getters and Setters
     * 			get and set the name and value for each card
     * 2.	describe (prints out information about a card)
     * *************
     */

    public StringBuilder describe() {
    	StringBuilder cardDescription = new StringBuilder();
    	if ( this.getValue() < 11) {
    		cardDescription.append("The " + this.getValue() + " of " + this.getName());
    	} else if (this.getValue() == 11) {
    		cardDescription.append("The Jack Of " + this.getName());
    	} else if (this.getValue() == 12) {
    		cardDescription.append("The Queen Of " + this.getName());
    	} else if (this.getValue() == 13) {
    		cardDescription.append("The King Of " + this.getName());
    	} else if (this.getValue() == 14) {
    		cardDescription.append("The Ace Of " + this.getName());
    	}
    	return cardDescription;
    }

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
}