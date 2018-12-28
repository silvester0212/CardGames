package Generic;

/**
 * Design Pattern - Factory
 * Put all instantiations of objects in this class
 * @author Silvester Yao
 */
public class GameFactory {
    /**
     * Card Department
     * Making 52 kinds of Card (4 Suites x 13 Ranks)
     */
    public static Card make_Card_Two_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.TWO));
    }

    public static Card make_Card_Three_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.THREE));
    }

    public static Card make_Card_Four_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.FOUR));
    }

    public static Card make_Card_Five_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.FIVE));
    }

    public static Card make_Card_Six_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.SIX));
    }

    public static Card make_Card_Seven_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.SEVEN));
    }

    public static Card make_Card_Eight_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.EIGHT));
    }

    public static Card make_Card_Nine_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.NINE));
    }

    public static Card make_Card_Ten_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.TEN));
    }

    public static Card make_Card_Jack_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.JACK));
    }

    public static Card make_Card_Queen_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.QUEEN));
    }

    public static Card make_Card_King_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.KING));
    }

    public static Card make_Card_Ace_Spade() {
        return new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.ACE));
    }

    public static Card make_Card_Two_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.TWO));
    }

    public static Card make_Card_Three_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.THREE));
    }

    public static Card make_Card_Four_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.FOUR));
    }

    public static Card make_Card_Five_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.FIVE));
    }

    public static Card make_Card_Six_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.SIX));
    }

    public static Card make_Card_Seven_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.SEVEN));
    }

    public static Card make_Card_Eight_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.EIGHT));
    }

    public static Card make_Card_Nine_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.NINE));
    }

    public static Card make_Card_Ten_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.TEN));
    }

    public static Card make_Card_Jack_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.JACK));
    }

    public static Card make_Card_Queen_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.QUEEN));
    }

    public static Card make_Card_King_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.KING));
    }

    public static Card make_Card_Ace_Club() {
        return new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.ACE));
    }

    public static Card make_Card_Two_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.TWO));
    }

    public static Card make_Card_Three_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.THREE));
    }

    public static Card make_Card_Four_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.FOUR));
    }

    public static Card make_Card_Five_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.FIVE));
    }

    public static Card make_Card_Six_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.SIX));
    }

    public static Card make_Card_Seven_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.SEVEN));
    }

    public static Card make_Card_Eight_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.EIGHT));
    }

    public static Card make_Card_Nine_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.NINE));
    }

    public static Card make_Card_Ten_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.TEN));
    }

    public static Card make_Card_Jack_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.JACK));
    }

    public static Card make_Card_Queen_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.QUEEN));
    }

    public static Card make_Card_King_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.KING));
    }

    public static Card make_Card_Ace_Diamond() {
        return new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.ACE));
    }

    public static Card make_Card_Two_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.TWO));
    }

    public static Card make_Card_Three_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.THREE));
    }

    public static Card make_Card_Four_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.FOUR));
    }

    public static Card make_Card_Five_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.FIVE));
    }

    public static Card make_Card_Six_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.SIX));
    }

    public static Card make_Card_Seven_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.SEVEN));
    }

    public static Card make_Card_Eight_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.EIGHT));
    }

    public static Card make_Card_Nine_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.NINE));
    }

    public static Card make_Card_Ten_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.TEN));
    }

    public static Card make_Card_Jack_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.JACK));
    }

    public static Card make_Card_Queen_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.QUEEN));
    }

    public static Card make_Card_King_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.KING));
    }

    public static Card make_Card_Ace_Heart() {
        return new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.ACE));
    }

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
