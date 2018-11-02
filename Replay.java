/* Matt Nicol
 * Blackjack v4.2
 * 01/11/18
 * Eclipse v4.9.0
*/

package Blackjack;

import java.util.Scanner;

public class Replay {
	
	public static void again() {
		String pChoice = ""; 
		
			Scanner kboard = new Scanner(System.in);
			System.out.println("Would you like to play again? (Y/N)");
			pChoice = kboard.nextLine();
			
			if(pChoice.equalsIgnoreCase("y"))
			{
				Main.main(null);
			}
			System.out.println("Thanks for playing, come back soon!");
			kboard.close();
	}
}
