package cardsWAR;

/*
 * *************
 * Step 2.	Create a class called App with a main method
 * *************
 */

public class App {

    public static void main(String[] args) {
    	
    	 /*
         * ********************
         * Step 3.	Instantiate a Deck and two Players, call the shuffle method on the deck.
         * ********************
         */

        Deck deck = new Deck();
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        deck.shuffle();

        /*
         * ********************
         * Step 4.	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
         * ********************
         */
        for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        /*
         * ********************
         * Step 5.	Using a traditional for loop, iterate 26 times and call the flip method for each player.
         * a.	Compare the value of each card returned by the two player’s flip methods.
         * Since our deck is initialized 2-14 it is just comparing the value of each card
         * 
         *  Call the incrementScore method on the player whose card has the higher value.
         *  adding a point to whoever has the higher value card

         * ********************
         */
        for (int i = 0; i < 26; i++) {
        	Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            
           if (player1Card.getValue() > player2Card.getValue()) {
            		player1.incrementScore();
            		System.out.print("PLAYER 1 CARDS ARE: " + "  " + player1Card.describe() + "    ");
            		System.out.println("PLAYER 2 CARDS ARE: " + "       " + player2Card.describe() + "\n");
            		System.out.println("   END OF THE ROUND "
                    		+ "\n   PLAYER 1 IS THE WINNER"
                        	+ "\n "
                    		+ "\n  THE SCORE IS NOW: "  + player1.getScore() + " TO " + player2.getScore()
                    		+ "\n ");
        }	   else if (player1Card.getValue() < player2Card.getValue()) {
                	player2.incrementScore();
                	System.out.print("PLAYER 1 CARDS ARE: " + "  " + player1Card.describe() + "    ");
            		System.out.println("PLAYER 2 CARDS ARE: " + "       " + player2Card.describe() + "\n");
            		System.out.println("   END OF THE ROUND "
            		+ "\n   PLAYER 2 IS THE WINNER"
                	+ "\n "
            		+ "\n  THE SCORE IS NOW: "  + player1.getScore() + " TO " + player2.getScore()
            		+ "\n ");
            } else if (player1Card.getValue() == player2Card.getValue()) {
            	System.out.print("PLAYER 1 CARDS ARE: " + "  " + player1Card.describe() + "    ");
        		System.out.println("PLAYER 2 CARDS ARE: " + "       " + player2Card.describe() + "\n");
            	System.out.println("***** THIS MEANS WAR ******" 
        		+ "\n   END OF THE ROUND " 
        		+ "\n   THERE ARE NO WINNERS IN WAR"
            	+ "\n "
        		+ "\n  THE SCORE IS NOW: "  + player1.getScore() + " TO " + player2.getScore()
        		+ "\n ");
        		
        }
        }
       			System.out.println();
        		System.out.println("###############" + "\nEND OF GAME" + "\n###############" + "\n");
        /*
         * ********************
         * Step 6.	After the loop, compare the final score from each player. 
         * Step 7.	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
         * using an if else loop we are able to compare the value of each players card and return the winner
         * ********************
         */
        //
        System.out.println(player1.describe() + "\n");
        System.out.println();
        System.out.println(player2.describe() + "\n");
        System.out.println();
        
        System.out.println("###############" + "\nFINAL SCORE" + "\n###############" + "\n");
  
        
        System.out.println("Player 1 score: " + player1.getScore() + "\nPlayer 2 score: " + player2.getScore() + "\n" + "\n");
        
        
        
        if (player1.getScore() > player2.getScore()) {
        	System.out.println("###############"  
        					+  "\nGAME RESULTS ARE: PLAYER 1 WINS" 
        					+	"\n###############"		);
        } else if (player1.getScore() < player2.getScore()) {
        	System.out.println("###############"  
					+  "\nGAME RESULTS ARE: PLAYER 2 WINS" 
					+	"\n###############"		);
        } else {
        	System.out.println("###############"  
					+  "\nGAME RESULTS ARE: DRAW!" 
					+	"\n###############"		);
        }
        System.out.println("\n");
        System.out.println("###############" + "\n ###############" + "\n THIS CONCLUDES THIS SESSION OF WAR" + "\n ###############" + "\n###############"  + "\n" + "\n");
    }
    
   
}
