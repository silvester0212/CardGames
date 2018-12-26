package Generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    public void TwoTest() {
        Rank two = new Rank(Rank.RankEnum.TWO);

        // Test Rank TWO hashCode
        assertEquals(two.hashCode(), 0);

        // Test Rank TWO equals
        assertNotEquals(two, null);
        assertNotEquals(two, 2);
        assertNotEquals(two, "two");
        assertEquals(two, new Rank(Rank.RankEnum.TWO));
        assertEquals(two, new Rank(0));
        assertEquals(two, GameFactory.make_Rank_Two());

        // Test Rank TWO clone
        Rank clonedTwo = two.clone();
        assertEquals(two, clonedTwo);
        assertNotSame(two, clonedTwo);

        // Test Rank toString
        assertEquals(two.toString(), "2");

        System.out.println("Rank Two tests passed.");
    }

    @Test
    public void ThreeTest() {
        Rank three = new Rank(Rank.RankEnum.THREE);

        // Test Rank THREE hashCode
        assertEquals(three.hashCode(), 1);

        // Test Rank THREE equals
        assertNotEquals(three, null);
        assertNotEquals(three, 3);
        assertNotEquals(three, "three");
        assertEquals(three, new Rank(Rank.RankEnum.THREE));
        assertEquals(three, new Rank(1));
        assertEquals(three, GameFactory.make_Rank_Three());

        // Test Rank THREE clone
        Rank clonedThree = three.clone();
        assertEquals(three, clonedThree);
        assertNotSame(three, clonedThree);

        // Test Rank toString
        assertEquals(three.toString(), "3");

        System.out.println("Rank Three tests passed.");
    }

    @Test
    public void FourTest() {
        Rank four = new Rank(Rank.RankEnum.FOUR);

        // Test Rank FOUR hashCode
        assertEquals(four.hashCode(), 2);

        // Test Rank FOUR equals
        assertNotEquals(four, null);
        assertNotEquals(four, 4);
        assertNotEquals(four, "four");
        assertEquals(four, new Rank(Rank.RankEnum.FOUR));
        assertEquals(four, new Rank(2));
        assertEquals(four, GameFactory.make_Rank_Four());

        // Test Rank FOUR clone
        Rank clonedFour = four.clone();
        assertEquals(four, clonedFour);
        assertNotSame(four, clonedFour);

        // Test Rank toString
        assertEquals(four.toString(), "4");

        System.out.println("Rank Four tests passed.");
    }

    @Test
    public void FiveTest() {
        Rank five = new Rank(Rank.RankEnum.FIVE);

        // Test Rank FIVE hashCode
        assertEquals(five.hashCode(), 3);

        // Test Rank FIVE equals
        assertNotEquals(five, null);
        assertNotEquals(five, 5);
        assertNotEquals(five, "five");
        assertEquals(five, new Rank(Rank.RankEnum.FIVE));
        assertEquals(five, new Rank(3));
        assertEquals(five, GameFactory.make_Rank_Five());

        // Test Rank FIVE clone
        Rank clonedFive = five.clone();
        assertEquals(five, clonedFive);
        assertNotSame(five, clonedFive);

        // Test Rank toString
        assertEquals(five.toString(), "5");

        System.out.println("Rank Five tests passed.");
    }

    @Test
    public void SixTest() {
        Rank six = new Rank(Rank.RankEnum.SIX);

        // Test Rank SIX hashCode
        assertEquals(six.hashCode(), 4);

        // Test Rank SIX equals
        assertNotEquals(six, null);
        assertNotEquals(six, 6);
        assertNotEquals(six, "six");
        assertEquals(six, new Rank(Rank.RankEnum.SIX));
        assertEquals(six, new Rank(4));
        assertEquals(six, GameFactory.make_Rank_Six());

        // Test Rank SIX clone
        Rank clonedSix = six.clone();
        assertEquals(six, clonedSix);
        assertNotSame(six, clonedSix);

        // Test Rank toString
        assertEquals(six.toString(), "6");

        System.out.println("Rank Six tests passed.");
    }

    @Test
    public void SevenTest() {
        Rank seven = new Rank(Rank.RankEnum.SEVEN);

        // Test Rank SEVEN hashCode
        assertEquals(seven.hashCode(), 5);

        // Test Rank SEVEN equals
        assertNotEquals(seven, null);
        assertNotEquals(seven, 7);
        assertNotEquals(seven, "seven");
        assertEquals(seven, new Rank(Rank.RankEnum.SEVEN));
        assertEquals(seven, new Rank(5));
        assertEquals(seven, GameFactory.make_Rank_Seven());

        // Test Rank SEVEN clone
        Rank clonedSeven = seven.clone();
        assertEquals(seven, clonedSeven);
        assertNotSame(seven, clonedSeven);

        // Test Rank toString
        assertEquals(seven.toString(), "7");

        System.out.println("Rank Seven tests passed.");
    }

    @Test
    public void EightTest() {
        Rank eight = new Rank(Rank.RankEnum.EIGHT);

        // Test Rank EIGHT hashCode
        assertEquals(eight.hashCode(), 6);

        // Test Rank EIGHT equals
        assertNotEquals(eight, null);
        assertNotEquals(eight, 8);
        assertNotEquals(eight, "eight");
        assertEquals(eight, new Rank(Rank.RankEnum.EIGHT));
        assertEquals(eight, new Rank(6));
        assertEquals(eight, GameFactory.make_Rank_Eight());

        // Test Rank EIGHT clone
        Rank clonedEight = eight.clone();
        assertEquals(eight, clonedEight);
        assertNotSame(eight, clonedEight);

        // Test Rank toString
        assertEquals(eight.toString(), "8");

        System.out.println("Rank Eight tests passed.");
    }

    @Test
    public void NineTest() {
        Rank nine = new Rank(Rank.RankEnum.NINE);

        // Test Rank NINE hashCode
        assertEquals(nine.hashCode(), 7);

        // Test Rank NINE equals
        assertNotEquals(nine, null);
        assertNotEquals(nine, 9);
        assertNotEquals(nine, "nine");
        assertEquals(nine, new Rank(Rank.RankEnum.NINE));
        assertEquals(nine, new Rank(7));
        assertEquals(nine, GameFactory.make_Rank_Nine());

        // Test Rank NINE clone
        Rank clonedNine = nine.clone();
        assertEquals(nine, clonedNine);
        assertNotSame(nine, clonedNine);

        // Test Rank toString
        assertEquals(nine.toString(), "9");

        System.out.println("Rank Nine tests passed.");
    }

    @Test
    public void TenTest() {
        Rank ten = new Rank(Rank.RankEnum.TEN);

        // Test Rank TEN hashCode
        assertEquals(ten.hashCode(), 8);

        // Test Rank TEN equals
        assertNotEquals(ten, null);
        assertNotEquals(ten, 10);
        assertNotEquals(ten, "ten");
        assertEquals(ten, new Rank(Rank.RankEnum.TEN));
        assertEquals(ten, new Rank(8));
        assertEquals(ten, GameFactory.make_Rank_Ten());

        // Test Rank TEN clone
        Rank clonedTen = ten.clone();
        assertEquals(ten, clonedTen);
        assertNotSame(ten, clonedTen);

        // Test Rank toString
        assertEquals(ten.toString(), "10");

        System.out.println("Rank Ten tests passed.");
    }

    @Test
    public void JackTest() {
        Rank jack = new Rank(Rank.RankEnum.JACK);

        // Test Rank JACK hashCode
        assertEquals(jack.hashCode(), 9);

        // Test Rank JACK equals
        assertNotEquals(jack, null);
        assertNotEquals(jack, 11);
        assertNotEquals(jack, "jack");
        assertEquals(jack, new Rank(Rank.RankEnum.JACK));
        assertEquals(jack, new Rank(9));
        assertEquals(jack, GameFactory.make_Rank_Jack());

        // Test Rank JACK clone
        Rank clonedJack = jack.clone();
        assertEquals(jack, clonedJack);
        assertNotSame(jack, clonedJack);

        // Test Rank toString
        assertEquals(jack.toString(), "J");

        System.out.println("Rank Jack tests passed.");
    }

    @Test
    public void QueenTest() {
        Rank queen = new Rank(Rank.RankEnum.QUEEN);

        // Test Rank QUEEN hashCode
        assertEquals(queen.hashCode(), 10);

        // Test Rank QUEEN equals
        assertNotEquals(queen, null);
        assertNotEquals(queen, 12);
        assertNotEquals(queen, "queen");
        assertEquals(queen, new Rank(Rank.RankEnum.QUEEN));
        assertEquals(queen, new Rank(10));
        assertEquals(queen, GameFactory.make_Rank_Queen());

        // Test Rank QUEEN clone
        Rank clonedQueen = queen.clone();
        assertEquals(queen, clonedQueen);
        assertNotSame(queen, clonedQueen);

        // Test Rank toString
        assertEquals(queen.toString(), "Q");

        System.out.println("Rank Queen tests passed.");
    }

    @Test
    public void KingTest() {
        Rank king = new Rank(Rank.RankEnum.KING);

        // Test Rank KING hashCode
        assertEquals(king.hashCode(), 11);

        // Test Rank KING equals
        assertNotEquals(king, null);
        assertNotEquals(king, 13);
        assertNotEquals(king, "king");
        assertEquals(king, new Rank(Rank.RankEnum.KING));
        assertEquals(king, new Rank(11));
        assertEquals(king, GameFactory.make_Rank_King());

        // Test Rank KING clone
        Rank clonedKing = king.clone();
        assertEquals(king, clonedKing);
        assertNotSame(king, clonedKing);

        // Test Rank toString
        assertEquals(king.toString(), "K");

        System.out.println("Rank King tests passed.");
    }

    @Test
    public void AceTest() {
        Rank ace = new Rank(Rank.RankEnum.ACE);

        // Test Rank ACE hashCode
        assertEquals(ace.hashCode(), 12);

        // Test Rank ACE equals
        assertNotEquals(ace, null);
        assertNotEquals(ace, 14);
        assertNotEquals(ace, "ace");
        assertEquals(ace, new Rank(Rank.RankEnum.ACE));
        assertEquals(ace, new Rank(12));
        assertEquals(ace, GameFactory.make_Rank_Ace());

        // Test Rank ACE clone
        Rank clonedAce = ace.clone();
        assertEquals(ace, clonedAce);
        assertNotSame(ace, clonedAce);

        // Test Rank toString
        assertEquals(ace.toString(), "A");

        System.out.println("Rank Ace tests passed.");
    }
    
    @Test
    public void OtherTest() {
        assertThrows(IllegalArgumentException.class, () -> {Rank illegalRank = new Rank (-1);}, "Rank Index out of bound, must be between 0 to 12.");
        assertThrows(IllegalArgumentException.class, () -> {Rank illegalRank = new Rank (13);}, "Rank Index out of bound, must be between 0 to 12.");
        System.out.println("Rank Exception tests passed");
    }
}