/* Matt Nicol
 * Blackjack v4
 * 01/11/18
 * Eclipse v4.9.0
*/

package BlackJack;

import java.util.Scanner;

//Punter Player
public class Punter extends Player {
	private static String uName;
	
	public Punter(String userName) 
	{
	uName = userName;	
	}
	
	public String getName() {
		return (uName);
	}
	
	public static String setName() 
	{
	    Scanner kboard = new Scanner(System.in);
	    System.out.println("Please enter your name: ");
	    uName = kboard.nextLine();
	    return(uName);
	}
}
