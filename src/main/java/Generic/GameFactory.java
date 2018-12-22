package Generic;

public class GameFactory {
    public static Suit makeSpadeSuit() {
        return new Suit(Suit.SuitEnum.SPADE);
    }

    public static Suit makeClubSuit() {
        return new Suit(Suit.SuitEnum.CLUB);
    }

    public static Suit makeDiamondSuit() {
        return new Suit(Suit.SuitEnum.DIAMOND);
    }

    public static Suit makeHeartSuit() {
        return new Suit(Suit.SuitEnum.HEART);
    }
}
