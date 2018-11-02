/* Matt Nicol
 * Blackjack v4.2
 * 01/11/18
 * Eclipse v4.9.0
*/

package Blackjack;

import java.util.Scanner;

public class Main {

	
    public static void main(String[] args) {
    	Deck blackJackDeck = new Deck();
    	Scanner kboard = new Scanner(System.in);
    	blackJackDeck.shuffle();
    	String choice = "";
    	boolean results;
    	
    	Punter player1 = new Punter(Punter.setName());
    	Dealer house = new Dealer();

    	player1.twist(player1.getHeldHand(),blackJackDeck.deal());
    	player1.twist(player1.getHeldHand(),blackJackDeck.deal());
    	System.out.println("Welcome to the table " + player1.getName());
    	System.out.println("Your hand total is = " + player1.getHeldHand().getTotalValue());
    	System.out.println("Do you want to stick (S) or twist (T)?");
    	choice = kboard.nextLine();
    	
    	while(choice.equalsIgnoreCase("t"))
    	{
    		switch (choice.toUpperCase()) 
    		{
    		case "T":
    			player1.twist(player1.getHeldHand(),blackJackDeck.deal());
    			break;
    		case "S":
    			break;
    		default:
    			break;
    		}
        	System.out.println("Your hand total is = " +player1.getHeldHand().getTotalValue());
        	System.out.println("Do you want to stick (S) or twist (T)?");
        	choice = kboard.nextLine();
    	}
    	
    	
    	house.twist(house.getHeldHand(),blackJackDeck.deal());
    	house.twist(house.getHeldHand(),blackJackDeck.deal());
    	while(house.getHeldHand().getTotalValue() < 16) 
    	{
    		house.twist(house.getHeldHand(),blackJackDeck.deal());
    	}
    	System.out.println("The Dealer has = " + house.getHeldHand().getTotalValue());
    	results = GameResult.getResult(player1.getHeldHand().getTotalValue(),house.getHeldHand().getTotalValue());
    	GameResult.winnersCircle(results);
    	Replay.again();
    	kboard.close();
    
    }
}