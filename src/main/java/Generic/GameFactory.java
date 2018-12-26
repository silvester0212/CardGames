package Generic;

/**
 * Design Pattern - Factory
 * Put all instantiations of objects in this class
 * @author Silvester Yao
 */
public class GameFactory {
    /**
     * Suit Department
     * Making four kinds of Suits
     */
    public static Suit make_Suit_Spade() {
        return new Suit(Suit.SuitEnum.SPADE);
    }

    public static Suit make_Suit_Club() {
        return new Suit(Suit.SuitEnum.CLUB);
    }

    public static Suit make_Suit_Diamond() {
        return new Suit(Suit.SuitEnum.DIAMOND);
    }

    public static Suit make_Suit_Heart() {
        return new Suit(Suit.SuitEnum.HEART);
    }

    /**
     * Rank Department
     * Making 13 kinds of Ranks
     */
    public static Rank make_Rank_Two() {
        return new Rank(Rank.RankEnum.TWO);
    }

    public static Rank make_Rank_Three() {
        return new Rank(Rank.RankEnum.THREE);
    }

    public static Rank make_Rank_Four() {
        return new Rank(Rank.RankEnum.FOUR);
    }

    public static Rank make_Rank_Five() {
        return new Rank(Rank.RankEnum.FIVE);
    }

    public static Rank make_Rank_Six() {
        return new Rank(Rank.RankEnum.SIX);
    }

    public static Rank make_Rank_Seven() {
        return new Rank(Rank.RankEnum.SEVEN);
    }

    public static Rank make_Rank_Eight() {
        return new Rank(Rank.RankEnum.EIGHT);
    }

    public static Rank make_Rank_Nine() {
        return new Rank(Rank.RankEnum.NINE);
    }

    public static Rank make_Rank_Ten() {
        return new Rank(Rank.RankEnum.TEN);
    }

    public static Rank make_Rank_Jack() {
        return new Rank(Rank.RankEnum.JACK);
    }

    public static Rank make_Rank_Queen() {
        return new Rank(Rank.RankEnum.QUEEN);
    }

    public static Rank make_Rank_King() {
        return new Rank(Rank.RankEnum.KING);
    }

    public static Rank make_Rank_Ace() {
        return new Rank(Rank.RankEnum.ACE);
    }
}
