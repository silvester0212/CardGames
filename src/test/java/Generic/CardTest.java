package Generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void TwoSpadeTest() {
        Card cardTwoSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.TWO));

        // Hash Code
        assertEquals(cardTwoSpade.hashCode(), 0);

        // Equals
        assertNotEquals(cardTwoSpade, null);
        assertNotEquals(cardTwoSpade, 0);
        assertNotEquals(cardTwoSpade, "2 OF SPADE");
        assertNotEquals(cardTwoSpade, new int[] {0, 0});
        assertEquals(cardTwoSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.TWO)));
        assertEquals(cardTwoSpade, new Card(0, 0));
        assertEquals(cardTwoSpade, GameFactory.make_Card_Two_Spade());

        // Clone
        Card clonedTwoSpade = cardTwoSpade.clone();
        assertEquals(cardTwoSpade, clonedTwoSpade);
        assertNotSame(cardTwoSpade, clonedTwoSpade);

        // toString
        assertEquals(cardTwoSpade.toString(), '\u2660' + "2");

        // getRank
        assertEquals(cardTwoSpade.getRank(), GameFactory.make_Rank_Two());

        // getSuit
        assertEquals(cardTwoSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Two of Spade tests passed.");
    }

    @Test
    void ThreeSpadeTest() {
        Card cardThreeSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.THREE));

        // Hash Code
        assertEquals(cardThreeSpade.hashCode(), 1);

        // Equals
        assertNotEquals(cardThreeSpade, null);
        assertNotEquals(cardThreeSpade, 1);
        assertNotEquals(cardThreeSpade, "3 OF SPADE");
        assertNotEquals(cardThreeSpade, new int[] {0, 1});
        assertEquals(cardThreeSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.THREE)));
        assertEquals(cardThreeSpade, new Card(0, 1));
        assertEquals(cardThreeSpade, GameFactory.make_Card_Three_Spade());

        // Clone
        Card clonedThreeSpade = cardThreeSpade.clone();
        assertEquals(cardThreeSpade, clonedThreeSpade);
        assertNotSame(cardThreeSpade, clonedThreeSpade);

        // toString
        assertEquals(cardThreeSpade.toString(), '\u2660' + "3");

        // getRank
        assertEquals(cardThreeSpade.getRank(), GameFactory.make_Rank_Three());

        // getSuit
        assertEquals(cardThreeSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Three of Spade tests passed.");
    }

    @Test
    void FourSpadeTest() {
        Card cardFourSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.FOUR));

        // Hash Code
        assertEquals(cardFourSpade.hashCode(), 2);

        // Equals
        assertNotEquals(cardFourSpade, null);
        assertNotEquals(cardFourSpade, 2);
        assertNotEquals(cardFourSpade, "4 OF SPADE");
        assertNotEquals(cardFourSpade, new int[] {0, 2});
        assertEquals(cardFourSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.FOUR)));
        assertEquals(cardFourSpade, new Card(0, 2));
        assertEquals(cardFourSpade, GameFactory.make_Card_Four_Spade());

        // Clone
        Card clonedFourSpade = cardFourSpade.clone();
        assertEquals(cardFourSpade, clonedFourSpade);
        assertNotSame(cardFourSpade, clonedFourSpade);

        // toString
        assertEquals(cardFourSpade.toString(), '\u2660' + "4");

        // getRank
        assertEquals(cardFourSpade.getRank(), GameFactory.make_Rank_Four());

        // getSuit
        assertEquals(cardFourSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Four of Spade tests passed.");
    }

    @Test
    void FiveSpadeTest() {
        Card cardFiveSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.FIVE));

        // Hash Code
        assertEquals(cardFiveSpade.hashCode(), 3);

        // Equals
        assertNotEquals(cardFiveSpade, null);
        assertNotEquals(cardFiveSpade, 3);
        assertNotEquals(cardFiveSpade, "5 OF SPADE");
        assertNotEquals(cardFiveSpade, new int[] {0, 3});
        assertEquals(cardFiveSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.FIVE)));
        assertEquals(cardFiveSpade, new Card(0, 3));
        assertEquals(cardFiveSpade, GameFactory.make_Card_Five_Spade());

        // Clone
        Card clonedFiveSpade = cardFiveSpade.clone();
        assertEquals(cardFiveSpade, clonedFiveSpade);
        assertNotSame(cardFiveSpade, clonedFiveSpade);

        // toString
        assertEquals(cardFiveSpade.toString(), '\u2660' + "5");

        // getRank
        assertEquals(cardFiveSpade.getRank(), GameFactory.make_Rank_Five());

        // getSuit
        assertEquals(cardFiveSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Five of Spade tests passed.");
    }

    @Test
    void SixSpadeTest() {
        Card cardSixSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.SIX));

        // Hash Code
        assertEquals(cardSixSpade.hashCode(), 4);

        // Equals
        assertNotEquals(cardSixSpade, null);
        assertNotEquals(cardSixSpade, 4);
        assertNotEquals(cardSixSpade, "6 OF SPADE");
        assertNotEquals(cardSixSpade, new int[] {0, 4});
        assertEquals(cardSixSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.SIX)));
        assertEquals(cardSixSpade, new Card(0, 4));
        assertEquals(cardSixSpade, GameFactory.make_Card_Six_Spade());

        // Clone
        Card clonedSixSpade = cardSixSpade.clone();
        assertEquals(cardSixSpade, clonedSixSpade);
        assertNotSame(cardSixSpade, clonedSixSpade);

        // toString
        assertEquals(cardSixSpade.toString(), '\u2660' + "6");

        // getRank
        assertEquals(cardSixSpade.getRank(), GameFactory.make_Rank_Six());

        // getSuit
        assertEquals(cardSixSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Six of Spade tests passed.");
    }

    @Test
    void SevenSpadeTest() {
        Card cardSevenSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.SEVEN));

        // Hash Code
        assertEquals(cardSevenSpade.hashCode(), 5);

        // Equals
        assertNotEquals(cardSevenSpade, null);
        assertNotEquals(cardSevenSpade, 5);
        assertNotEquals(cardSevenSpade, "7 OF SPADE");
        assertNotEquals(cardSevenSpade, new int[] {0, 5});
        assertEquals(cardSevenSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.SEVEN)));
        assertEquals(cardSevenSpade, new Card(0, 5));
        assertEquals(cardSevenSpade, GameFactory.make_Card_Seven_Spade());

        // Clone
        Card clonedSevenSpade = cardSevenSpade.clone();
        assertEquals(cardSevenSpade, clonedSevenSpade);
        assertNotSame(cardSevenSpade, clonedSevenSpade);

        // toString
        assertEquals(cardSevenSpade.toString(), '\u2660' + "7");

        // getRank
        assertEquals(cardSevenSpade.getRank(), GameFactory.make_Rank_Seven());

        // getSuit
        assertEquals(cardSevenSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Seven of Spade tests passed.");
    }

    @Test
    void EightSpadeTest() {
        Card cardEightSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.EIGHT));

        // Hash Code
        assertEquals(cardEightSpade.hashCode(), 6);

        // Equals
        assertNotEquals(cardEightSpade, null);
        assertNotEquals(cardEightSpade, 6);
        assertNotEquals(cardEightSpade, "8 OF SPADE");
        assertNotEquals(cardEightSpade, new int[] {0, 6});
        assertEquals(cardEightSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.EIGHT)));
        assertEquals(cardEightSpade, new Card(0, 6));
        assertEquals(cardEightSpade, GameFactory.make_Card_Eight_Spade());

        // Clone
        Card clonedEightSpade = cardEightSpade.clone();
        assertEquals(cardEightSpade, clonedEightSpade);
        assertNotSame(cardEightSpade, clonedEightSpade);

        // toString
        assertEquals(cardEightSpade.toString(), '\u2660' + "8");

        // getRank
        assertEquals(cardEightSpade.getRank(), GameFactory.make_Rank_Eight());

        // getSuit
        assertEquals(cardEightSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Eight of Spade tests passed.");
    }

    @Test
    void NineSpadeTest() {
        Card cardNineSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.NINE));

        // Hash Code
        assertEquals(cardNineSpade.hashCode(), 7);

        // Equals
        assertNotEquals(cardNineSpade, null);
        assertNotEquals(cardNineSpade, 7);
        assertNotEquals(cardNineSpade, "9 OF SPADE");
        assertNotEquals(cardNineSpade, new int[] {0, 7});
        assertEquals(cardNineSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.NINE)));
        assertEquals(cardNineSpade, new Card(0, 7));
        assertEquals(cardNineSpade, GameFactory.make_Card_Nine_Spade());

        // Clone
        Card clonedNineSpade = cardNineSpade.clone();
        assertEquals(cardNineSpade, clonedNineSpade);
        assertNotSame(cardNineSpade, clonedNineSpade);

        // toString
        assertEquals(cardNineSpade.toString(), '\u2660' + "9");

        // getRank
        assertEquals(cardNineSpade.getRank(), GameFactory.make_Rank_Nine());

        // getSuit
        assertEquals(cardNineSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Nine of Spade tests passed.");
    }

    @Test
    void TenSpadeTest() {
        Card cardTenSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.TEN));

        // Hash Code
        assertEquals(cardTenSpade.hashCode(), 8);

        // Equals
        assertNotEquals(cardTenSpade, null);
        assertNotEquals(cardTenSpade, 8);
        assertNotEquals(cardTenSpade, "10 OF SPADE");
        assertNotEquals(cardTenSpade, new int[] {0, 8});
        assertEquals(cardTenSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.TEN)));
        assertEquals(cardTenSpade, new Card(0, 8));
        assertEquals(cardTenSpade, GameFactory.make_Card_Ten_Spade());

        // Clone
        Card clonedTenSpade = cardTenSpade.clone();
        assertEquals(cardTenSpade, clonedTenSpade);
        assertNotSame(cardTenSpade, clonedTenSpade);

        // toString
        assertEquals(cardTenSpade.toString(), '\u2660' + "10");

        // getRank
        assertEquals(cardTenSpade.getRank(), GameFactory.make_Rank_Ten());

        // getSuit
        assertEquals(cardTenSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Ten of Spade tests passed.");
    }

    @Test
    void JackSpadeTest() {
        Card cardJackSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.JACK));

        // Hash Code
        assertEquals(cardJackSpade.hashCode(), 9);

        // Equals
        assertNotEquals(cardJackSpade, null);
        assertNotEquals(cardJackSpade, 9);
        assertNotEquals(cardJackSpade, "J OF SPADE");
        assertNotEquals(cardJackSpade, new int[] {0, 9});
        assertEquals(cardJackSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.JACK)));
        assertEquals(cardJackSpade, new Card(0, 9));
        assertEquals(cardJackSpade, GameFactory.make_Card_Jack_Spade());

        // Clone
        Card clonedJackSpade = cardJackSpade.clone();
        assertEquals(cardJackSpade, clonedJackSpade);
        assertNotSame(cardJackSpade, clonedJackSpade);

        // toString
        assertEquals(cardJackSpade.toString(), '\u2660' + "J");

        // getRank
        assertEquals(cardJackSpade.getRank(), GameFactory.make_Rank_Jack());

        // getSuit
        assertEquals(cardJackSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Jack of Spade tests passed.");
    }

    @Test
    void QueenSpadeTest() {
        Card cardQueenSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.QUEEN));

        // Hash Code
        assertEquals(cardQueenSpade.hashCode(), 10);

        // Equals
        assertNotEquals(cardQueenSpade, null);
        assertNotEquals(cardQueenSpade, 10);
        assertNotEquals(cardQueenSpade, "Q OF SPADE");
        assertNotEquals(cardQueenSpade, new int[] {0, 10});
        assertEquals(cardQueenSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.QUEEN)));
        assertEquals(cardQueenSpade, new Card(0, 10));
        assertEquals(cardQueenSpade, GameFactory.make_Card_Queen_Spade());

        // Clone
        Card clonedQueenSpade = cardQueenSpade.clone();
        assertEquals(cardQueenSpade, clonedQueenSpade);
        assertNotSame(cardQueenSpade, clonedQueenSpade);

        // toString
        assertEquals(cardQueenSpade.toString(), '\u2660' + "Q");

        // getRank
        assertEquals(cardQueenSpade.getRank(), GameFactory.make_Rank_Queen());

        // getSuit
        assertEquals(cardQueenSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Queen of Spade tests passed.");
    }

    @Test
    void KingSpadeTest() {
        Card cardKingSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.KING));

        // Hash Code
        assertEquals(cardKingSpade.hashCode(), 11);

        // Equals
        assertNotEquals(cardKingSpade, null);
        assertNotEquals(cardKingSpade, 11);
        assertNotEquals(cardKingSpade, "K OF SPADE");
        assertNotEquals(cardKingSpade, new int[] {0, 11});
        assertEquals(cardKingSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.KING)));
        assertEquals(cardKingSpade, new Card(0, 11));
        assertEquals(cardKingSpade, GameFactory.make_Card_King_Spade());

        // Clone
        Card clonedKingSpade = cardKingSpade.clone();
        assertEquals(cardKingSpade, clonedKingSpade);
        assertNotSame(cardKingSpade, clonedKingSpade);

        // toString
        assertEquals(cardKingSpade.toString(), '\u2660' + "K");

        // getRank
        assertEquals(cardKingSpade.getRank(), GameFactory.make_Rank_King());

        // getSuit
        assertEquals(cardKingSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card King of Spade tests passed.");
    }

    @Test
    void AceSpadeTest() {
        Card cardAceSpade = new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.ACE));

        // Hash Code
        assertEquals(cardAceSpade.hashCode(), 12);

        // Equals
        assertNotEquals(cardAceSpade, null);
        assertNotEquals(cardAceSpade, 12);
        assertNotEquals(cardAceSpade, "A OF SPADE");
        assertNotEquals(cardAceSpade, new int[] {0, 12});
        assertEquals(cardAceSpade, new Card(new Suit(Suit.SuitEnum.SPADE), new Rank(Rank.RankEnum.ACE)));
        assertEquals(cardAceSpade, new Card(0, 12));
        assertEquals(cardAceSpade, GameFactory.make_Card_Ace_Spade());

        // Clone
        Card clonedAceSpade = cardAceSpade.clone();
        assertEquals(cardAceSpade, clonedAceSpade);
        assertNotSame(cardAceSpade, clonedAceSpade);

        // toString
        assertEquals(cardAceSpade.toString(), '\u2660' + "A");

        // getRank
        assertEquals(cardAceSpade.getRank(), GameFactory.make_Rank_Ace());

        // getSuit
        assertEquals(cardAceSpade.getSuit(), GameFactory.make_Suit_Spade());

        System.out.println("Card Ace of Spade tests passed.");
    }

    @Test
    void TwoClubTest() {
        Card cardTwoClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.TWO));

        // Hash Code
        assertEquals(cardTwoClub.hashCode(), 100);

        // Equals
        assertNotEquals(cardTwoClub, null);
        assertNotEquals(cardTwoClub, 100);
        assertNotEquals(cardTwoClub, "2 OF CLUB");
        assertNotEquals(cardTwoClub, new int[] {1, 0});
        assertEquals(cardTwoClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.TWO)));
        assertEquals(cardTwoClub, new Card(1, 0));
        assertEquals(cardTwoClub, GameFactory.make_Card_Two_Club());

        // Clone
        Card clonedTwoClub = cardTwoClub.clone();
        assertEquals(cardTwoClub, clonedTwoClub);
        assertNotSame(cardTwoClub, clonedTwoClub);

        // toString
        assertEquals(cardTwoClub.toString(), '\u2663' + "2");

        // getRank
        assertEquals(cardTwoClub.getRank(), GameFactory.make_Rank_Two());

        // getSuit
        assertEquals(cardTwoClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Two of Club tests passed.");
    }

    @Test
    void ThreeClubTest() {
        Card cardThreeClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.THREE));

        // Hash Code
        assertEquals(cardThreeClub.hashCode(), 101);

        // Equals
        assertNotEquals(cardThreeClub, null);
        assertNotEquals(cardThreeClub, 101);
        assertNotEquals(cardThreeClub, "3 OF CLUB");
        assertNotEquals(cardThreeClub, new int[] {1, 1});
        assertEquals(cardThreeClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.THREE)));
        assertEquals(cardThreeClub, new Card(1, 1));
        assertEquals(cardThreeClub, GameFactory.make_Card_Three_Club());

        // Clone
        Card clonedThreeClub = cardThreeClub.clone();
        assertEquals(cardThreeClub, clonedThreeClub);
        assertNotSame(cardThreeClub, clonedThreeClub);

        // toString
        assertEquals(cardThreeClub.toString(), '\u2663' + "3");

        // getRank
        assertEquals(cardThreeClub.getRank(), GameFactory.make_Rank_Three());

        // getSuit
        assertEquals(cardThreeClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Three of Club tests passed.");
    }

    @Test
    void FourClubTest() {
        Card cardFourClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.FOUR));

        // Hash Code
        assertEquals(cardFourClub.hashCode(), 102);

        // Equals
        assertNotEquals(cardFourClub, null);
        assertNotEquals(cardFourClub, 102);
        assertNotEquals(cardFourClub, "4 OF CLUB");
        assertNotEquals(cardFourClub, new int[] {1, 2});
        assertEquals(cardFourClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.FOUR)));
        assertEquals(cardFourClub, new Card(1, 2));
        assertEquals(cardFourClub, GameFactory.make_Card_Four_Club());

        // Clone
        Card clonedFourClub = cardFourClub.clone();
        assertEquals(cardFourClub, clonedFourClub);
        assertNotSame(cardFourClub, clonedFourClub);

        // toString
        assertEquals(cardFourClub.toString(), '\u2663' + "4");

        // getRank
        assertEquals(cardFourClub.getRank(), GameFactory.make_Rank_Four());

        // getSuit
        assertEquals(cardFourClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Four of Club tests passed.");
    }

    @Test
    void FiveClubTest() {
        Card cardFiveClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.FIVE));

        // Hash Code
        assertEquals(cardFiveClub.hashCode(), 103);

        // Equals
        assertNotEquals(cardFiveClub, null);
        assertNotEquals(cardFiveClub, 103);
        assertNotEquals(cardFiveClub, "5 OF CLUB");
        assertNotEquals(cardFiveClub, new int[] {1, 3});
        assertEquals(cardFiveClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.FIVE)));
        assertEquals(cardFiveClub, new Card(1, 3));
        assertEquals(cardFiveClub, GameFactory.make_Card_Five_Club());

        // Clone
        Card clonedFiveClub = cardFiveClub.clone();
        assertEquals(cardFiveClub, clonedFiveClub);
        assertNotSame(cardFiveClub, clonedFiveClub);

        // toString
        assertEquals(cardFiveClub.toString(), '\u2663' + "5");

        // getRank
        assertEquals(cardFiveClub.getRank(), GameFactory.make_Rank_Five());

        // getSuit
        assertEquals(cardFiveClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Five of Club tests passed.");
    }

    @Test
    void SixClubTest() {
        Card cardSixClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.SIX));

        // Hash Code
        assertEquals(cardSixClub.hashCode(), 104);

        // Equals
        assertNotEquals(cardSixClub, null);
        assertNotEquals(cardSixClub, 104);
        assertNotEquals(cardSixClub, "6 OF CLUB");
        assertNotEquals(cardSixClub, new int[] {1, 4});
        assertEquals(cardSixClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.SIX)));
        assertEquals(cardSixClub, new Card(1, 4));
        assertEquals(cardSixClub, GameFactory.make_Card_Six_Club());

        // Clone
        Card clonedSixClub = cardSixClub.clone();
        assertEquals(cardSixClub, clonedSixClub);
        assertNotSame(cardSixClub, clonedSixClub);

        // toString
        assertEquals(cardSixClub.toString(), '\u2663' + "6");

        // getRank
        assertEquals(cardSixClub.getRank(), GameFactory.make_Rank_Six());

        // getSuit
        assertEquals(cardSixClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Six of Club tests passed.");
    }

    @Test
    void SevenClubTest() {
        Card cardSevenClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.SEVEN));

        // Hash Code
        assertEquals(cardSevenClub.hashCode(), 105);

        // Equals
        assertNotEquals(cardSevenClub, null);
        assertNotEquals(cardSevenClub, 105);
        assertNotEquals(cardSevenClub, "7 OF CLUB");
        assertNotEquals(cardSevenClub, new int[] {1, 5});
        assertEquals(cardSevenClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.SEVEN)));
        assertEquals(cardSevenClub, new Card(1, 5));
        assertEquals(cardSevenClub, GameFactory.make_Card_Seven_Club());

        // Clone
        Card clonedSevenClub = cardSevenClub.clone();
        assertEquals(cardSevenClub, clonedSevenClub);
        assertNotSame(cardSevenClub, clonedSevenClub);

        // toString
        assertEquals(cardSevenClub.toString(), '\u2663' + "7");

        // getRank
        assertEquals(cardSevenClub.getRank(), GameFactory.make_Rank_Seven());

        // getSuit
        assertEquals(cardSevenClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Seven of Club tests passed.");
    }

    @Test
    void EightClubTest() {
        Card cardEightClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.EIGHT));

        // Hash Code
        assertEquals(cardEightClub.hashCode(), 106);

        // Equals
        assertNotEquals(cardEightClub, null);
        assertNotEquals(cardEightClub, 106);
        assertNotEquals(cardEightClub, "8 OF CLUB");
        assertNotEquals(cardEightClub, new int[] {1, 6});
        assertEquals(cardEightClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.EIGHT)));
        assertEquals(cardEightClub, new Card(1, 6));
        assertEquals(cardEightClub, GameFactory.make_Card_Eight_Club());

        // Clone
        Card clonedEightClub = cardEightClub.clone();
        assertEquals(cardEightClub, clonedEightClub);
        assertNotSame(cardEightClub, clonedEightClub);

        // toString
        assertEquals(cardEightClub.toString(), '\u2663' + "8");

        // getRank
        assertEquals(cardEightClub.getRank(), GameFactory.make_Rank_Eight());

        // getSuit
        assertEquals(cardEightClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Eight of Club tests passed.");
    }

    @Test
    void NineClubTest() {
        Card cardNineClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.NINE));

        // Hash Code
        assertEquals(cardNineClub.hashCode(), 107);

        // Equals
        assertNotEquals(cardNineClub, null);
        assertNotEquals(cardNineClub, 107);
        assertNotEquals(cardNineClub, "9 OF CLUB");
        assertNotEquals(cardNineClub, new int[] {1, 7});
        assertEquals(cardNineClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.NINE)));
        assertEquals(cardNineClub, new Card(1, 7));
        assertEquals(cardNineClub, GameFactory.make_Card_Nine_Club());

        // Clone
        Card clonedNineClub = cardNineClub.clone();
        assertEquals(cardNineClub, clonedNineClub);
        assertNotSame(cardNineClub, clonedNineClub);

        // toString
        assertEquals(cardNineClub.toString(), '\u2663' + "9");

        // getRank
        assertEquals(cardNineClub.getRank(), GameFactory.make_Rank_Nine());

        // getSuit
        assertEquals(cardNineClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Nine of Club tests passed.");
    }

    @Test
    void TenClubTest() {
        Card cardTenClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.TEN));

        // Hash Code
        assertEquals(cardTenClub.hashCode(), 108);

        // Equals
        assertNotEquals(cardTenClub, null);
        assertNotEquals(cardTenClub, 108);
        assertNotEquals(cardTenClub, "10 OF CLUB");
        assertNotEquals(cardTenClub, new int[] {1, 8});
        assertEquals(cardTenClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.TEN)));
        assertEquals(cardTenClub, new Card(1, 8));
        assertEquals(cardTenClub, GameFactory.make_Card_Ten_Club());

        // Clone
        Card clonedTenClub = cardTenClub.clone();
        assertEquals(cardTenClub, clonedTenClub);
        assertNotSame(cardTenClub, clonedTenClub);

        // toString
        assertEquals(cardTenClub.toString(), '\u2663' + "10");

        // getRank
        assertEquals(cardTenClub.getRank(), GameFactory.make_Rank_Ten());

        // getSuit
        assertEquals(cardTenClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Ten of Club tests passed.");
    }

    @Test
    void JackClubTest() {
        Card cardJackClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.JACK));

        // Hash Code
        assertEquals(cardJackClub.hashCode(), 109);

        // Equals
        assertNotEquals(cardJackClub, null);
        assertNotEquals(cardJackClub, 109);
        assertNotEquals(cardJackClub, "J OF CLUB");
        assertNotEquals(cardJackClub, new int[] {1, 9});
        assertEquals(cardJackClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.JACK)));
        assertEquals(cardJackClub, new Card(1, 9));
        assertEquals(cardJackClub, GameFactory.make_Card_Jack_Club());

        // Clone
        Card clonedJackClub = cardJackClub.clone();
        assertEquals(cardJackClub, clonedJackClub);
        assertNotSame(cardJackClub, clonedJackClub);

        // toString
        assertEquals(cardJackClub.toString(), '\u2663' + "J");

        // getRank
        assertEquals(cardJackClub.getRank(), GameFactory.make_Rank_Jack());

        // getSuit
        assertEquals(cardJackClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Jack of Club tests passed.");
    }

    @Test
    void QueenClubTest() {
        Card cardQueenClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.QUEEN));

        // Hash Code
        assertEquals(cardQueenClub.hashCode(), 110);

        // Equals
        assertNotEquals(cardQueenClub, null);
        assertNotEquals(cardQueenClub, 110);
        assertNotEquals(cardQueenClub, "Q OF CLUB");
        assertNotEquals(cardQueenClub, new int[] {1, 10});
        assertEquals(cardQueenClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.QUEEN)));
        assertEquals(cardQueenClub, new Card(1, 10));
        assertEquals(cardQueenClub, GameFactory.make_Card_Queen_Club());

        // Clone
        Card clonedQueenClub = cardQueenClub.clone();
        assertEquals(cardQueenClub, clonedQueenClub);
        assertNotSame(cardQueenClub, clonedQueenClub);

        // toString
        assertEquals(cardQueenClub.toString(), '\u2663' + "Q");

        // getRank
        assertEquals(cardQueenClub.getRank(), GameFactory.make_Rank_Queen());

        // getSuit
        assertEquals(cardQueenClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Queen of Club tests passed.");
    }

    @Test
    void KingClubTest() {
        Card cardKingClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.KING));

        // Hash Code
        assertEquals(cardKingClub.hashCode(), 111);

        // Equals
        assertNotEquals(cardKingClub, null);
        assertNotEquals(cardKingClub, 111);
        assertNotEquals(cardKingClub, "K OF CLUB");
        assertNotEquals(cardKingClub, new int[] {1, 11});
        assertEquals(cardKingClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.KING)));
        assertEquals(cardKingClub, new Card(1, 11));
        assertEquals(cardKingClub, GameFactory.make_Card_King_Club());

        // Clone
        Card clonedKingClub = cardKingClub.clone();
        assertEquals(cardKingClub, clonedKingClub);
        assertNotSame(cardKingClub, clonedKingClub);

        // toString
        assertEquals(cardKingClub.toString(), '\u2663' + "K");

        // getRank
        assertEquals(cardKingClub.getRank(), GameFactory.make_Rank_King());

        // getSuit
        assertEquals(cardKingClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card King of Club tests passed.");
    }

    @Test
    void AceClubTest() {
        Card cardAceClub = new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.ACE));

        // Hash Code
        assertEquals(cardAceClub.hashCode(), 112);

        // Equals
        assertNotEquals(cardAceClub, null);
        assertNotEquals(cardAceClub, 112);
        assertNotEquals(cardAceClub, "A OF CLUB");
        assertNotEquals(cardAceClub, new int[] {1, 12});
        assertEquals(cardAceClub, new Card(new Suit(Suit.SuitEnum.CLUB), new Rank(Rank.RankEnum.ACE)));
        assertEquals(cardAceClub, new Card(1, 12));
        assertEquals(cardAceClub, GameFactory.make_Card_Ace_Club());

        // Clone
        Card clonedAceClub = cardAceClub.clone();
        assertEquals(cardAceClub, clonedAceClub);
        assertNotSame(cardAceClub, clonedAceClub);

        // toString
        assertEquals(cardAceClub.toString(), '\u2663' + "A");

        // getRank
        assertEquals(cardAceClub.getRank(), GameFactory.make_Rank_Ace());

        // getSuit
        assertEquals(cardAceClub.getSuit(), GameFactory.make_Suit_Club());

        System.out.println("Card Ace of Club tests passed.");
    }

    @Test
    void TwoDiamondTest() {
        Card cardTwoDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.TWO));

        // Hash Code
        assertEquals(cardTwoDiamond.hashCode(), 200);

        // Equals
        assertNotEquals(cardTwoDiamond, null);
        assertNotEquals(cardTwoDiamond, 200);
        assertNotEquals(cardTwoDiamond, "2 OF DIAMOND");
        assertNotEquals(cardTwoDiamond, new int[] {2, 0});
        assertEquals(cardTwoDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.TWO)));
        assertEquals(cardTwoDiamond, new Card(2, 0));
        assertEquals(cardTwoDiamond, GameFactory.make_Card_Two_Diamond());

        // Clone
        Card clonedTwoDiamond = cardTwoDiamond.clone();
        assertEquals(cardTwoDiamond, clonedTwoDiamond);
        assertNotSame(cardTwoDiamond, clonedTwoDiamond);

        // toString
        assertEquals(cardTwoDiamond.toString(), '\u2666' + "2");

        // getRank
        assertEquals(cardTwoDiamond.getRank(), GameFactory.make_Rank_Two());

        // getSuit
        assertEquals(cardTwoDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Two of Diamond tests passed.");
    }

    @Test
    void ThreeDiamondTest() {
        Card cardThreeDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.THREE));

        // Hash Code
        assertEquals(cardThreeDiamond.hashCode(), 201);

        // Equals
        assertNotEquals(cardThreeDiamond, null);
        assertNotEquals(cardThreeDiamond, 201);
        assertNotEquals(cardThreeDiamond, "3 OF DIAMOND");
        assertNotEquals(cardThreeDiamond, new int[] {2, 1});
        assertEquals(cardThreeDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.THREE)));
        assertEquals(cardThreeDiamond, new Card(2, 1));
        assertEquals(cardThreeDiamond, GameFactory.make_Card_Three_Diamond());

        // Clone
        Card clonedThreeDiamond = cardThreeDiamond.clone();
        assertEquals(cardThreeDiamond, clonedThreeDiamond);
        assertNotSame(cardThreeDiamond, clonedThreeDiamond);

        // toString
        assertEquals(cardThreeDiamond.toString(), '\u2666' + "3");

        // getRank
        assertEquals(cardThreeDiamond.getRank(), GameFactory.make_Rank_Three());

        // getSuit
        assertEquals(cardThreeDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Three of Diamond tests passed.");
    }

    @Test
    void FourDiamondTest() {
        Card cardFourDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.FOUR));

        // Hash Code
        assertEquals(cardFourDiamond.hashCode(), 202);

        // Equals
        assertNotEquals(cardFourDiamond, null);
        assertNotEquals(cardFourDiamond, 202);
        assertNotEquals(cardFourDiamond, "4 OF DIAMOND");
        assertNotEquals(cardFourDiamond, new int[] {2, 2});
        assertEquals(cardFourDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.FOUR)));
        assertEquals(cardFourDiamond, new Card(2, 2));
        assertEquals(cardFourDiamond, GameFactory.make_Card_Four_Diamond());

        // Clone
        Card clonedFourDiamond = cardFourDiamond.clone();
        assertEquals(cardFourDiamond, clonedFourDiamond);
        assertNotSame(cardFourDiamond, clonedFourDiamond);

        // toString
        assertEquals(cardFourDiamond.toString(), '\u2666' + "4");

        // getRank
        assertEquals(cardFourDiamond.getRank(), GameFactory.make_Rank_Four());

        // getSuit
        assertEquals(cardFourDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Four of Diamond tests passed.");
    }

    @Test
    void FiveDiamondTest() {
        Card cardFiveDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.FIVE));

        // Hash Code
        assertEquals(cardFiveDiamond.hashCode(), 203);

        // Equals
        assertNotEquals(cardFiveDiamond, null);
        assertNotEquals(cardFiveDiamond, 203);
        assertNotEquals(cardFiveDiamond, "5 OF DIAMOND");
        assertNotEquals(cardFiveDiamond, new int[] {2, 3});
        assertEquals(cardFiveDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.FIVE)));
        assertEquals(cardFiveDiamond, new Card(2, 3));
        assertEquals(cardFiveDiamond, GameFactory.make_Card_Five_Diamond());

        // Clone
        Card clonedFiveDiamond = cardFiveDiamond.clone();
        assertEquals(cardFiveDiamond, clonedFiveDiamond);
        assertNotSame(cardFiveDiamond, clonedFiveDiamond);

        // toString
        assertEquals(cardFiveDiamond.toString(), '\u2666' + "5");

        // getRank
        assertEquals(cardFiveDiamond.getRank(), GameFactory.make_Rank_Five());

        // getSuit
        assertEquals(cardFiveDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Five of Diamond tests passed.");
    }

    @Test
    void SixDiamondTest() {
        Card cardSixDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.SIX));

        // Hash Code
        assertEquals(cardSixDiamond.hashCode(), 204);

        // Equals
        assertNotEquals(cardSixDiamond, null);
        assertNotEquals(cardSixDiamond, 204);
        assertNotEquals(cardSixDiamond, "6 OF DIAMOND");
        assertNotEquals(cardSixDiamond, new int[] {2, 4});
        assertEquals(cardSixDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.SIX)));
        assertEquals(cardSixDiamond, new Card(2, 4));
        assertEquals(cardSixDiamond, GameFactory.make_Card_Six_Diamond());

        // Clone
        Card clonedSixDiamond = cardSixDiamond.clone();
        assertEquals(cardSixDiamond, clonedSixDiamond);
        assertNotSame(cardSixDiamond, clonedSixDiamond);

        // toString
        assertEquals(cardSixDiamond.toString(), '\u2666' + "6");

        // getRank
        assertEquals(cardSixDiamond.getRank(), GameFactory.make_Rank_Six());

        // getSuit
        assertEquals(cardSixDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Six of Diamond tests passed.");
    }

    @Test
    void SevenDiamondTest() {
        Card cardSevenDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.SEVEN));

        // Hash Code
        assertEquals(cardSevenDiamond.hashCode(), 205);

        // Equals
        assertNotEquals(cardSevenDiamond, null);
        assertNotEquals(cardSevenDiamond, 205);
        assertNotEquals(cardSevenDiamond, "7 OF DIAMOND");
        assertNotEquals(cardSevenDiamond, new int[] {2, 5});
        assertEquals(cardSevenDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.SEVEN)));
        assertEquals(cardSevenDiamond, new Card(2, 5));
        assertEquals(cardSevenDiamond, GameFactory.make_Card_Seven_Diamond());

        // Clone
        Card clonedSevenDiamond = cardSevenDiamond.clone();
        assertEquals(cardSevenDiamond, clonedSevenDiamond);
        assertNotSame(cardSevenDiamond, clonedSevenDiamond);

        // toString
        assertEquals(cardSevenDiamond.toString(), '\u2666' + "7");

        // getRank
        assertEquals(cardSevenDiamond.getRank(), GameFactory.make_Rank_Seven());

        // getSuit
        assertEquals(cardSevenDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Seven of Diamond tests passed.");
    }

    @Test
    void EightDiamondTest() {
        Card cardEightDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.EIGHT));

        // Hash Code
        assertEquals(cardEightDiamond.hashCode(), 206);

        // Equals
        assertNotEquals(cardEightDiamond, null);
        assertNotEquals(cardEightDiamond, 206);
        assertNotEquals(cardEightDiamond, "8 OF DIAMOND");
        assertNotEquals(cardEightDiamond, new int[] {2, 6});
        assertEquals(cardEightDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.EIGHT)));
        assertEquals(cardEightDiamond, new Card(2, 6));
        assertEquals(cardEightDiamond, GameFactory.make_Card_Eight_Diamond());

        // Clone
        Card clonedEightDiamond = cardEightDiamond.clone();
        assertEquals(cardEightDiamond, clonedEightDiamond);
        assertNotSame(cardEightDiamond, clonedEightDiamond);

        // toString
        assertEquals(cardEightDiamond.toString(), '\u2666' + "8");

        // getRank
        assertEquals(cardEightDiamond.getRank(), GameFactory.make_Rank_Eight());

        // getSuit
        assertEquals(cardEightDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Eight of Diamond tests passed.");
    }

    @Test
    void NineDiamondTest() {
        Card cardNineDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.NINE));

        // Hash Code
        assertEquals(cardNineDiamond.hashCode(), 207);

        // Equals
        assertNotEquals(cardNineDiamond, null);
        assertNotEquals(cardNineDiamond, 207);
        assertNotEquals(cardNineDiamond, "9 OF DIAMOND");
        assertNotEquals(cardNineDiamond, new int[] {2, 7});
        assertEquals(cardNineDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.NINE)));
        assertEquals(cardNineDiamond, new Card(2, 7));
        assertEquals(cardNineDiamond, GameFactory.make_Card_Nine_Diamond());

        // Clone
        Card clonedNineDiamond = cardNineDiamond.clone();
        assertEquals(cardNineDiamond, clonedNineDiamond);
        assertNotSame(cardNineDiamond, clonedNineDiamond);

        // toString
        assertEquals(cardNineDiamond.toString(), '\u2666' + "9");

        // getRank
        assertEquals(cardNineDiamond.getRank(), GameFactory.make_Rank_Nine());

        // getSuit
        assertEquals(cardNineDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Nine of Diamond tests passed.");
    }

    @Test
    void TenDiamondTest() {
        Card cardTenDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.TEN));

        // Hash Code
        assertEquals(cardTenDiamond.hashCode(), 208);

        // Equals
        assertNotEquals(cardTenDiamond, null);
        assertNotEquals(cardTenDiamond, 208);
        assertNotEquals(cardTenDiamond, "10 OF DIAMOND");
        assertNotEquals(cardTenDiamond, new int[] {2, 8});
        assertEquals(cardTenDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.TEN)));
        assertEquals(cardTenDiamond, new Card(2, 8));
        assertEquals(cardTenDiamond, GameFactory.make_Card_Ten_Diamond());

        // Clone
        Card clonedTenDiamond = cardTenDiamond.clone();
        assertEquals(cardTenDiamond, clonedTenDiamond);
        assertNotSame(cardTenDiamond, clonedTenDiamond);

        // toString
        assertEquals(cardTenDiamond.toString(), '\u2666' + "10");

        // getRank
        assertEquals(cardTenDiamond.getRank(), GameFactory.make_Rank_Ten());

        // getSuit
        assertEquals(cardTenDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Ten of Diamond tests passed.");
    }

    @Test
    void JackDiamondTest() {
        Card cardJackDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.JACK));

        // Hash Code
        assertEquals(cardJackDiamond.hashCode(), 209);

        // Equals
        assertNotEquals(cardJackDiamond, null);
        assertNotEquals(cardJackDiamond, 209);
        assertNotEquals(cardJackDiamond, "J OF DIAMOND");
        assertNotEquals(cardJackDiamond, new int[] {2, 9});
        assertEquals(cardJackDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.JACK)));
        assertEquals(cardJackDiamond, new Card(2, 9));
        assertEquals(cardJackDiamond, GameFactory.make_Card_Jack_Diamond());

        // Clone
        Card clonedJackDiamond = cardJackDiamond.clone();
        assertEquals(cardJackDiamond, clonedJackDiamond);
        assertNotSame(cardJackDiamond, clonedJackDiamond);

        // toString
        assertEquals(cardJackDiamond.toString(), '\u2666' + "J");

        // getRank
        assertEquals(cardJackDiamond.getRank(), GameFactory.make_Rank_Jack());

        // getSuit
        assertEquals(cardJackDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Jack of Diamond tests passed.");
    }

    @Test
    void QueenDiamondTest() {
        Card cardQueenDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.QUEEN));

        // Hash Code
        assertEquals(cardQueenDiamond.hashCode(), 210);

        // Equals
        assertNotEquals(cardQueenDiamond, null);
        assertNotEquals(cardQueenDiamond, 210);
        assertNotEquals(cardQueenDiamond, "Q OF DIAMOND");
        assertNotEquals(cardQueenDiamond, new int[] {2, 10});
        assertEquals(cardQueenDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.QUEEN)));
        assertEquals(cardQueenDiamond, new Card(2, 10));
        assertEquals(cardQueenDiamond, GameFactory.make_Card_Queen_Diamond());

        // Clone
        Card clonedQueenDiamond = cardQueenDiamond.clone();
        assertEquals(cardQueenDiamond, clonedQueenDiamond);
        assertNotSame(cardQueenDiamond, clonedQueenDiamond);

        // toString
        assertEquals(cardQueenDiamond.toString(), '\u2666' + "Q");

        // getRank
        assertEquals(cardQueenDiamond.getRank(), GameFactory.make_Rank_Queen());

        // getSuit
        assertEquals(cardQueenDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Queen of Diamond tests passed.");
    }

    @Test
    void KingDiamondTest() {
        Card cardKingDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.KING));

        // Hash Code
        assertEquals(cardKingDiamond.hashCode(), 211);

        // Equals
        assertNotEquals(cardKingDiamond, null);
        assertNotEquals(cardKingDiamond, 211);
        assertNotEquals(cardKingDiamond, "K OF DIAMOND");
        assertNotEquals(cardKingDiamond, new int[] {2, 11});
        assertEquals(cardKingDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.KING)));
        assertEquals(cardKingDiamond, new Card(2, 11));
        assertEquals(cardKingDiamond, GameFactory.make_Card_King_Diamond());

        // Clone
        Card clonedKingDiamond = cardKingDiamond.clone();
        assertEquals(cardKingDiamond, clonedKingDiamond);
        assertNotSame(cardKingDiamond, clonedKingDiamond);

        // toString
        assertEquals(cardKingDiamond.toString(), '\u2666' + "K");

        // getRank
        assertEquals(cardKingDiamond.getRank(), GameFactory.make_Rank_King());

        // getSuit
        assertEquals(cardKingDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card King of Diamond tests passed.");
    }

    @Test
    void AceDiamondTest() {
        Card cardAceDiamond = new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.ACE));

        // Hash Code
        assertEquals(cardAceDiamond.hashCode(), 212);

        // Equals
        assertNotEquals(cardAceDiamond, null);
        assertNotEquals(cardAceDiamond, 212);
        assertNotEquals(cardAceDiamond, "A OF DIAMOND");
        assertNotEquals(cardAceDiamond, new int[] {2, 12});
        assertEquals(cardAceDiamond, new Card(new Suit(Suit.SuitEnum.DIAMOND), new Rank(Rank.RankEnum.ACE)));
        assertEquals(cardAceDiamond, new Card(2, 12));
        assertEquals(cardAceDiamond, GameFactory.make_Card_Ace_Diamond());

        // Clone
        Card clonedAceDiamond = cardAceDiamond.clone();
        assertEquals(cardAceDiamond, clonedAceDiamond);
        assertNotSame(cardAceDiamond, clonedAceDiamond);

        // toString
        assertEquals(cardAceDiamond.toString(), '\u2666' + "A");

        // getRank
        assertEquals(cardAceDiamond.getRank(), GameFactory.make_Rank_Ace());

        // getSuit
        assertEquals(cardAceDiamond.getSuit(), GameFactory.make_Suit_Diamond());

        System.out.println("Card Ace of Diamond tests passed.");
    }

    @Test
    void TwoHeartTest() {
        Card cardTwoHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.TWO));

        // Hash Code
        assertEquals(cardTwoHeart.hashCode(), 300);

        // Equals
        assertNotEquals(cardTwoHeart, null);
        assertNotEquals(cardTwoHeart, 300);
        assertNotEquals(cardTwoHeart, "2 OF HEART");
        assertNotEquals(cardTwoHeart, new int[] {3, 0});
        assertEquals(cardTwoHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.TWO)));
        assertEquals(cardTwoHeart, new Card(3, 0));
        assertEquals(cardTwoHeart, GameFactory.make_Card_Two_Heart());

        // Clone
        Card clonedTwoHeart = cardTwoHeart.clone();
        assertEquals(cardTwoHeart, clonedTwoHeart);
        assertNotSame(cardTwoHeart, clonedTwoHeart);

        // toString
        assertEquals(cardTwoHeart.toString(), '\u2764' + "2");

        // getRank
        assertEquals(cardTwoHeart.getRank(), GameFactory.make_Rank_Two());

        // getSuit
        assertEquals(cardTwoHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Two of Heart tests passed.");
    }

    @Test
    void ThreeHeartTest() {
        Card cardThreeHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.THREE));

        // Hash Code
        assertEquals(cardThreeHeart.hashCode(), 301);

        // Equals
        assertNotEquals(cardThreeHeart, null);
        assertNotEquals(cardThreeHeart, 301);
        assertNotEquals(cardThreeHeart, "3 OF HEART");
        assertNotEquals(cardThreeHeart, new int[] {3, 1});
        assertEquals(cardThreeHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.THREE)));
        assertEquals(cardThreeHeart, new Card(3, 1));
        assertEquals(cardThreeHeart, GameFactory.make_Card_Three_Heart());

        // Clone
        Card clonedThreeHeart = cardThreeHeart.clone();
        assertEquals(cardThreeHeart, clonedThreeHeart);
        assertNotSame(cardThreeHeart, clonedThreeHeart);

        // toString
        assertEquals(cardThreeHeart.toString(), '\u2764' + "3");

        // getRank
        assertEquals(cardThreeHeart.getRank(), GameFactory.make_Rank_Three());

        // getSuit
        assertEquals(cardThreeHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Three of Heart tests passed.");
    }

    @Test
    void FourHeartTest() {
        Card cardFourHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.FOUR));

        // Hash Code
        assertEquals(cardFourHeart.hashCode(), 302);

        // Equals
        assertNotEquals(cardFourHeart, null);
        assertNotEquals(cardFourHeart, 302);
        assertNotEquals(cardFourHeart, "4 OF HEART");
        assertNotEquals(cardFourHeart, new int[] {3, 2});
        assertEquals(cardFourHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.FOUR)));
        assertEquals(cardFourHeart, new Card(3, 2));
        assertEquals(cardFourHeart, GameFactory.make_Card_Four_Heart());

        // Clone
        Card clonedFourHeart = cardFourHeart.clone();
        assertEquals(cardFourHeart, clonedFourHeart);
        assertNotSame(cardFourHeart, clonedFourHeart);

        // toString
        assertEquals(cardFourHeart.toString(), '\u2764' + "4");

        // getRank
        assertEquals(cardFourHeart.getRank(), GameFactory.make_Rank_Four());

        // getSuit
        assertEquals(cardFourHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Four of Heart tests passed.");
    }

    @Test
    void FiveHeartTest() {
        Card cardFiveHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.FIVE));

        // Hash Code
        assertEquals(cardFiveHeart.hashCode(), 303);

        // Equals
        assertNotEquals(cardFiveHeart, null);
        assertNotEquals(cardFiveHeart, 303);
        assertNotEquals(cardFiveHeart, "5 OF HEART");
        assertNotEquals(cardFiveHeart, new int[] {3, 3});
        assertEquals(cardFiveHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.FIVE)));
        assertEquals(cardFiveHeart, new Card(3, 3));
        assertEquals(cardFiveHeart, GameFactory.make_Card_Five_Heart());

        // Clone
        Card clonedFiveHeart = cardFiveHeart.clone();
        assertEquals(cardFiveHeart, clonedFiveHeart);
        assertNotSame(cardFiveHeart, clonedFiveHeart);

        // toString
        assertEquals(cardFiveHeart.toString(), '\u2764' + "5");

        // getRank
        assertEquals(cardFiveHeart.getRank(), GameFactory.make_Rank_Five());

        // getSuit
        assertEquals(cardFiveHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Five of Heart tests passed.");
    }

    @Test
    void SixHeartTest() {
        Card cardSixHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.SIX));

        // Hash Code
        assertEquals(cardSixHeart.hashCode(), 304);

        // Equals
        assertNotEquals(cardSixHeart, null);
        assertNotEquals(cardSixHeart, 304);
        assertNotEquals(cardSixHeart, "6 OF HEART");
        assertNotEquals(cardSixHeart, new int[] {3, 4});
        assertEquals(cardSixHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.SIX)));
        assertEquals(cardSixHeart, new Card(3, 4));
        assertEquals(cardSixHeart, GameFactory.make_Card_Six_Heart());

        // Clone
        Card clonedSixHeart = cardSixHeart.clone();
        assertEquals(cardSixHeart, clonedSixHeart);
        assertNotSame(cardSixHeart, clonedSixHeart);

        // toString
        assertEquals(cardSixHeart.toString(), '\u2764' + "6");

        // getRank
        assertEquals(cardSixHeart.getRank(), GameFactory.make_Rank_Six());

        // getSuit
        assertEquals(cardSixHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Six of Heart tests passed.");
    }

    @Test
    void SevenHeartTest() {
        Card cardSevenHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.SEVEN));

        // Hash Code
        assertEquals(cardSevenHeart.hashCode(), 305);

        // Equals
        assertNotEquals(cardSevenHeart, null);
        assertNotEquals(cardSevenHeart, 305);
        assertNotEquals(cardSevenHeart, "7 OF HEART");
        assertNotEquals(cardSevenHeart, new int[] {3, 5});
        assertEquals(cardSevenHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.SEVEN)));
        assertEquals(cardSevenHeart, new Card(3, 5));
        assertEquals(cardSevenHeart, GameFactory.make_Card_Seven_Heart());

        // Clone
        Card clonedSevenHeart = cardSevenHeart.clone();
        assertEquals(cardSevenHeart, clonedSevenHeart);
        assertNotSame(cardSevenHeart, clonedSevenHeart);

        // toString
        assertEquals(cardSevenHeart.toString(), '\u2764' + "7");

        // getRank
        assertEquals(cardSevenHeart.getRank(), GameFactory.make_Rank_Seven());

        // getSuit
        assertEquals(cardSevenHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Seven of Heart tests passed.");
    }

    @Test
    void EightHeartTest() {
        Card cardEightHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.EIGHT));

        // Hash Code
        assertEquals(cardEightHeart.hashCode(), 306);

        // Equals
        assertNotEquals(cardEightHeart, null);
        assertNotEquals(cardEightHeart, 306);
        assertNotEquals(cardEightHeart, "8 OF HEART");
        assertNotEquals(cardEightHeart, new int[] {3, 6});
        assertEquals(cardEightHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.EIGHT)));
        assertEquals(cardEightHeart, new Card(3, 6));
        assertEquals(cardEightHeart, GameFactory.make_Card_Eight_Heart());

        // Clone
        Card clonedEightHeart = cardEightHeart.clone();
        assertEquals(cardEightHeart, clonedEightHeart);
        assertNotSame(cardEightHeart, clonedEightHeart);

        // toString
        assertEquals(cardEightHeart.toString(), '\u2764' + "8");

        // getRank
        assertEquals(cardEightHeart.getRank(), GameFactory.make_Rank_Eight());

        // getSuit
        assertEquals(cardEightHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Eight of Heart tests passed.");
    }

    @Test
    void NineHeartTest() {
        Card cardNineHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.NINE));

        // Hash Code
        assertEquals(cardNineHeart.hashCode(), 307);

        // Equals
        assertNotEquals(cardNineHeart, null);
        assertNotEquals(cardNineHeart, 307);
        assertNotEquals(cardNineHeart, "9 OF HEART");
        assertNotEquals(cardNineHeart, new int[] {3, 7});
        assertEquals(cardNineHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.NINE)));
        assertEquals(cardNineHeart, new Card(3, 7));
        assertEquals(cardNineHeart, GameFactory.make_Card_Nine_Heart());

        // Clone
        Card clonedNineHeart = cardNineHeart.clone();
        assertEquals(cardNineHeart, clonedNineHeart);
        assertNotSame(cardNineHeart, clonedNineHeart);

        // toString
        assertEquals(cardNineHeart.toString(), '\u2764' + "9");

        // getRank
        assertEquals(cardNineHeart.getRank(), GameFactory.make_Rank_Nine());

        // getSuit
        assertEquals(cardNineHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Nine of Heart tests passed.");
    }

    @Test
    void TenHeartTest() {
        Card cardTenHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.TEN));

        // Hash Code
        assertEquals(cardTenHeart.hashCode(), 308);

        // Equals
        assertNotEquals(cardTenHeart, null);
        assertNotEquals(cardTenHeart, 308);
        assertNotEquals(cardTenHeart, "10 OF HEART");
        assertNotEquals(cardTenHeart, new int[] {3, 8});
        assertEquals(cardTenHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.TEN)));
        assertEquals(cardTenHeart, new Card(3, 8));
        assertEquals(cardTenHeart, GameFactory.make_Card_Ten_Heart());

        // Clone
        Card clonedTenHeart = cardTenHeart.clone();
        assertEquals(cardTenHeart, clonedTenHeart);
        assertNotSame(cardTenHeart, clonedTenHeart);

        // toString
        assertEquals(cardTenHeart.toString(), '\u2764' + "10");

        // getRank
        assertEquals(cardTenHeart.getRank(), GameFactory.make_Rank_Ten());

        // getSuit
        assertEquals(cardTenHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Ten of Heart tests passed.");
    }

    @Test
    void JackHeartTest() {
        Card cardJackHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.JACK));

        // Hash Code
        assertEquals(cardJackHeart.hashCode(), 309);

        // Equals
        assertNotEquals(cardJackHeart, null);
        assertNotEquals(cardJackHeart, 309);
        assertNotEquals(cardJackHeart, "J OF HEART");
        assertNotEquals(cardJackHeart, new int[] {3, 9});
        assertEquals(cardJackHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.JACK)));
        assertEquals(cardJackHeart, new Card(3, 9));
        assertEquals(cardJackHeart, GameFactory.make_Card_Jack_Heart());

        // Clone
        Card clonedJackHeart = cardJackHeart.clone();
        assertEquals(cardJackHeart, clonedJackHeart);
        assertNotSame(cardJackHeart, clonedJackHeart);

        // toString
        assertEquals(cardJackHeart.toString(), '\u2764' + "J");

        // getRank
        assertEquals(cardJackHeart.getRank(), GameFactory.make_Rank_Jack());

        // getSuit
        assertEquals(cardJackHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Jack of Heart tests passed.");
    }

    @Test
    void QueenHeartTest() {
        Card cardQueenHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.QUEEN));

        // Hash Code
        assertEquals(cardQueenHeart.hashCode(), 310);

        // Equals
        assertNotEquals(cardQueenHeart, null);
        assertNotEquals(cardQueenHeart, 310);
        assertNotEquals(cardQueenHeart, "Q OF HEART");
        assertNotEquals(cardQueenHeart, new int[] {3, 10});
        assertEquals(cardQueenHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.QUEEN)));
        assertEquals(cardQueenHeart, new Card(3, 10));
        assertEquals(cardQueenHeart, GameFactory.make_Card_Queen_Heart());

        // Clone
        Card clonedQueenHeart = cardQueenHeart.clone();
        assertEquals(cardQueenHeart, clonedQueenHeart);
        assertNotSame(cardQueenHeart, clonedQueenHeart);

        // toString
        assertEquals(cardQueenHeart.toString(), '\u2764' + "Q");

        // getRank
        assertEquals(cardQueenHeart.getRank(), GameFactory.make_Rank_Queen());

        // getSuit
        assertEquals(cardQueenHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Queen of Heart tests passed.");
    }

    @Test
    void KingHeartTest() {
        Card cardKingHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.KING));

        // Hash Code
        assertEquals(cardKingHeart.hashCode(), 311);

        // Equals
        assertNotEquals(cardKingHeart, null);
        assertNotEquals(cardKingHeart, 311);
        assertNotEquals(cardKingHeart, "K OF HEART");
        assertNotEquals(cardKingHeart, new int[] {3, 11});
        assertEquals(cardKingHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.KING)));
        assertEquals(cardKingHeart, new Card(3, 11));
        assertEquals(cardKingHeart, GameFactory.make_Card_King_Heart());

        // Clone
        Card clonedKingHeart = cardKingHeart.clone();
        assertEquals(cardKingHeart, clonedKingHeart);
        assertNotSame(cardKingHeart, clonedKingHeart);

        // toString
        assertEquals(cardKingHeart.toString(), '\u2764' + "K");

        // getRank
        assertEquals(cardKingHeart.getRank(), GameFactory.make_Rank_King());

        // getSuit
        assertEquals(cardKingHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card King of Heart tests passed.");
    }

    @Test
    void AceHeartTest() {
        Card cardAceHeart = new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.ACE));

        // Hash Code
        assertEquals(cardAceHeart.hashCode(), 312);

        // Equals
        assertNotEquals(cardAceHeart, null);
        assertNotEquals(cardAceHeart, 312);
        assertNotEquals(cardAceHeart, "A OF HEART");
        assertNotEquals(cardAceHeart, new int[] {3, 12});
        assertEquals(cardAceHeart, new Card(new Suit(Suit.SuitEnum.HEART), new Rank(Rank.RankEnum.ACE)));
        assertEquals(cardAceHeart, new Card(3, 12));
        assertEquals(cardAceHeart, GameFactory.make_Card_Ace_Heart());

        // Clone
        Card clonedAceHeart = cardAceHeart.clone();
        assertEquals(cardAceHeart, clonedAceHeart);
        assertNotSame(cardAceHeart, clonedAceHeart);

        // toString
        assertEquals(cardAceHeart.toString(), '\u2764' + "A");

        // getRank
        assertEquals(cardAceHeart.getRank(), GameFactory.make_Rank_Ace());

        // getSuit
        assertEquals(cardAceHeart.getSuit(), GameFactory.make_Suit_Heart());

        System.out.println("Card Ace of Heart tests passed.");
    }

}