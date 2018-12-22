package Generic;

/**
 * Rank class
 * details the Rank of a Card
 * @author Silvester Yao
 */
public class Rank {

    /**
     * Rank Enum
     * Define all 13 ranks of a card
     */
    public enum RankEnum {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    }

    private final RankEnum rank;

    /**
     * Rank Constructor
     * @param _rank rank to be created
     */
    public Rank (RankEnum _rank) {
        rank = _rank;
    }

    /**
     * Rank Constructor
     * @param _rankIdx Integer (Rank Enum ordinal) to represent rank
     */
    public Rank (int _rankIdx) {
        if (_rankIdx < 0 || _rankIdx >= RankEnum.values().length) {
            throw new IllegalArgumentException("Rank Index out of bound. Only accept values from 0 to " + (RankEnum.values().length - 1));
        }

        rank = (RankEnum.values())[_rankIdx];
    }

    /**
     * Overrides hashCode method
     * @return the hashcode of a rank, implemented using Suit Enum ordinal
     */
    public int hashCode() {
        return this.rank.ordinal();
    }

    /**
     * Overrides equals method
     * @param obj other object to be compared against
     * @return True if and only if supplied object is of Rank class, and is of the same rank value
     */
    public boolean equals(Object obj) {
        if (obj == null || (! (obj instanceof Rank))) return false;
        return this.rank == ((Rank) obj).rank;
    }

    /**
     * Overrides clone method
     * @return a new Rank object that equals to current Rank object
     */
    public Rank clone() {
        return new Rank(this.rank);
    }

    /**
     * Overrides toString method
     * @return a string representation of suit
     */
    public String toString() {
        String r = new String();

        switch(rank) {
            case TWO:   r = "2";    break;
            case THREE: r = "3";    break;
            case FOUR:  r = "4";    break;
            case FIVE:  r = "5";    break;
            case SIX:   r = "6";    break;
            case SEVEN: r = "7";    break;
            case EIGHT: r = "8";    break;
            case NINE:  r = "9";    break;
            case TEN:   r = "10";   break;
            case JACK:  r = "J";    break;
            case QUEEN: r = "Q";    break;
            case KING:  r = "K";    break;
            case ACE:   r = "A";    break;
        }

        return r;
    }

}
