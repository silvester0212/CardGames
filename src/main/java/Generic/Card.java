package Generic;

/**
 * Card Class
 * An implementation of InterfaceCard interface
 * @author Silvester Yao
 */
public class Card implements InterfaceCard {
    private final Suit suit;
    private final Rank rank;

    /**
     * Constructor for Card
     * @param _suit Suit for this Card
     * @param _rank Rank for this Card
     */
    public Card (Suit _suit, Rank _rank) {
        suit = _suit;
        rank = _rank;
    }

    /**
     * Constructor for Card
     * @param suitIdx Suit Index (using Suit Enum ordinal) for Card
     * @param rankIdx Rank Index (using Rank Enum ordinal) for Card
     */
    public Card (int suitIdx, int rankIdx) {
        suit = new Suit(suitIdx);
        rank = new Rank(rankIdx);
    }

    /**
     * Override hashCode method
     * @return a unique integer identifier for a Card
     */
    @Override
    public int hashCode() {
        return 100 * suit.hashCode() + rank.hashCode();
    }

    /**
     * Override equals method
     * @param o other object to be compared against current object
     * @return True if provided object equals current object; False otherwise
     */
    public boolean equals(Object o) {
        if (o == null) return false;
        if (! (o instanceof Card)) return false;

        Card otherCard = (Card) o;
        Rank otherRank = otherCard.rank;
        Suit otherSuit = otherCard.suit;
        return this.rank.equals(otherRank) && this.suit.equals(otherSuit);
    }

    /**
     * Override clone method
     * @return a deep copy of the Card with same Rank and Suit
     */
    public Card clone() {
        return new Card(suit, rank);
    }

    /**
     * Override toString method
     * @return a String representation of this Card
     */
    public String toString() {
        return suit.toString() + rank.toString();
    }

    /**
     * Rank Getter
     * @return Rank of the Card
     */
    @Override
    public Rank getRank() {
        return rank;
    }

    /**
     * Suit Getter
     * @return Suit of the Card
     */
    @Override
    public Suit getSuit() {
        return suit;
    }
}
