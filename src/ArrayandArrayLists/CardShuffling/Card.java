package ArrayandArrayLists.CardShuffling;

// Card class represents a playing card.
public class Card {

    private final String face; // face of card ("Ace", "Deuce", ...)

    private final String suit;  // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    public Card(String face, String suit) {
        this.face = face; // initialize face of card
        this.suit = suit; // initialize suit of card
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
