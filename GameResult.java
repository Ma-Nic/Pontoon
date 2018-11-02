package Blackjack;

public class GameResult {
	
		
		//Calculate card total
		public static int getCardTotal(int card1, int card2)
		{
			return(card1+card2);
		}

		//Determine if player has busted out
		public static boolean isBusted(int cTotal)
		{
			if (cTotal > 21)
				return(true);
			else
				return(false);
		}
		
		//Determine if hand meets winning criteria
		public static boolean getResult(int cTotal, int house)
		{
			if (cTotal>house && cTotal<=21) 
				return(true); 			
			else if (cTotal <= 21 && GameResult.isBusted(house)==true)
				return (true);
			else
				return(false);
		}
		
		public static void winnersCircle(boolean outcome) {
			if(outcome == true) 
			{
				System.out.println("Congratulations! You win!!");
			}
			else 
			{ 
				System.out.println("Sorry, you lose!");
			}
		}
}

