/* Matt Nicol
 * Blackjack v4
 * 01/11/18
 * Eclipse v4.9.0
*/

package BlackJack;

public class Card {
    private final Suit suit;
    private final Face face;

    //Create a card from a suit and face
    public Card(Suit family, Face value)
    {
        suit = family;
        face = value;
    }


    public String toString() {
        return face +  " of " + suit;
    }
}
