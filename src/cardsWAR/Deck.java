package cardsWAR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {  
    /*
     * *************
     * Step 1. part b. section i. number 1 (Deck)
     *  1.	cards (List of Card)
     *  Create a new list of cards with corresponding suits to create a deck
     * *************
     */
  
    List<Card> cards = new ArrayList<Card>();
    List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
    
    /*
     * *************
     * Step 1. part b. section ii. number 1 & 2
     *  
     *  1.	shuffle (randomizes the order of the cards)
     *  By instantiating Collections.shuffle it returns a random value of <card>
     *  
     *  2.	draw (removes and returns the top card of the Cards field)
     *  cards.remove() is going to return the value specified at that index and by returning it we will get the top card; 
     *  in essence drawing from a deck
     *  
     *  3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
     *  By nesting for loops inside of each other we are simultaneously adding a value to suits and cards
     *  by doing this 2 - 14 and through 4 suits we'll get 52 cards
     * *************
     */

    public Deck() {

        for (int i = 2; i <= 14; i++) {

            for (String suit : suits) {
                cards.add(new Card(i, suit));
            }
        }
        
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
