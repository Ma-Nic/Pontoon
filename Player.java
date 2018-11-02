/* Matt Nicol
 * Blackjack v4.2
 * 01/11/18
 * Eclipse v4.9.0
*/

package Blackjack;

public abstract class Player {

	private Hand heldHand;
	
	public Player()
	{
		heldHand = new Hand();
	}

	public void setHeldHand(Hand playerHand)
	{
		this.heldHand = playerHand;
	}
	
	public Hand getHeldHand() 
	{
		return heldHand;
	}
	
	public void twist(Hand dealtHand, Card twistCard)
	{
		dealtHand.addCard(dealtHand, twistCard);
		setHeldHand(dealtHand);
	}


}
