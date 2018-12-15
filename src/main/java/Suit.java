/**
 * Class Suit
 * Define the Suit of a Card
 * @author Silvester Yao
 */
public class Suit {
    /**
     * Suit Enum
     * Define all four Suit of a card
     */
    public enum SuitEnum {
        SPADE, CLUB, DIAMOND, HEART
    }

    private final SuitEnum suit;

    /**
     * Suit Constructor
     * @param _suit suit to be created
     */
    public Suit (SuitEnum _suit) {
        suit = _suit;
    }

    /**
     * Suit Constructor
     * @param suitIdx Integer (Suit Enum ordinal) to represent Suit.
     */
    public Suit (int suitIdx) {
        SuitEnum[] allSuits = SuitEnum.values();

        if (suitIdx < 0 || suitIdx >= allSuits.length) {
            throw new IllegalArgumentException("Suit Index out of bound, must be bewteen 0 to " + (allSuits.length - 1) + ".");
        }

        this.suit = allSuits[suitIdx];
    }

    /**
     * Overrides hashCode method
     * @return the hashcode of a Suit, implemented using Suit Enum ordinal
     */
    public int hashCode() {
        return this.suit.ordinal();
    }

    /**
     * Overrides equals method
     * @param obj other object to be compared against
     * @return True if and only if supplied object is of Suit class, and is of the same suit value
     */
    public boolean equals(Object obj) {
        if (obj == null || (! (obj instanceof Suit))) return false;
        return this.suit == ((Suit) obj).suit;
    }

    public Suit clone() {
        return new Suit(this.suit);
    }

    /**
     * Ovverrides toString method
     * @return a string representation of suit
     */
    public String toString() {
        return String.valueOf(this.getSymbol());
    }

    /**
     * @return the char symbol for this suit
     */
    public char getSymbol() {
        char r = ' ';

        switch (suit) {
            case SPADE:     r = '\u2660';   break;
            case CLUB:      r = '\u2663';   break;
            case DIAMOND:   r = '\u2666';   break;
            case HEART:     r = '\u2764';   break;
        }

        return r;
    }
}
