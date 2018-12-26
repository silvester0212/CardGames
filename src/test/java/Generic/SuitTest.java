package Generic;

import Generic.GameFactory;
import org.junit.jupiter.api.Test;
import Generic.Suit;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    public final static char spadeSymbol = '\u2660';
    public final static char clubSymbol = '\u2663';
    public final static char diamondSymbol = '\u2666';
    public final static char heartSymbol = '\u2764';

    @Test
    void SpadeTest() {
        Suit spade = new Suit(Suit.SuitEnum.SPADE);

        // Test Spade HashCode
        assertEquals(spade.hashCode(), 0);

        // Test Spade Equals
        assertNotEquals(spade, null);
        assertNotEquals(spade, 3);
        assertNotEquals(spade, 'c');
        assertEquals(spade, new Suit(Suit.SuitEnum.SPADE));
        assertEquals(spade, GameFactory.make_Suit_Spade());
        assertEquals(spade, new Suit(spade.hashCode()));

        // Test Spade Clone
        Suit clonedSpade = spade.clone();
        assertEquals(spade, clonedSpade);
        assertNotSame(spade, clonedSpade);

        // Test Spade toString
        assertEquals(spade.toString(), "" + spadeSymbol);

        // Test Spade getSymbol
        assertEquals(spade.getSymbol(), spadeSymbol);

        System.out.println("Suit Spade tests passed.");
    }

    @Test
    void ClubTest() {
        Suit club = new Suit(Suit.SuitEnum.CLUB);

        // Test Club HashCode
        assertEquals(club.hashCode(), 1);

        // Test Club Equals
        assertNotEquals(club, null);
        assertNotEquals(club, 3);
        assertNotEquals(club, 'c');
        assertEquals(club, new Suit(Suit.SuitEnum.CLUB));
        assertEquals(club, GameFactory.make_Suit_Club());
        assertEquals(club, new Suit(club.hashCode()));

        // Test Club Clone
        Suit clonedClub = club.clone();
        assertEquals(club, clonedClub);
        assertNotSame(club, clonedClub);

        // Test Club toString
        assertEquals(club.toString(), "" + clubSymbol);

        // Test Club getSymbol
        assertEquals(club.getSymbol(), clubSymbol);

        System.out.println("Suit Club tests passed.");
    }

    @Test
    void DiamondTest() {
        Suit diamond = new Suit(Suit.SuitEnum.DIAMOND);

        // Test Diamond HashCode
        assertEquals(diamond.hashCode(), 2);

        // Test Diamond Equals
        assertNotEquals(diamond, null);
        assertNotEquals(diamond, 3);
        assertNotEquals(diamond, 'c');
        assertEquals(diamond, new Suit(Suit.SuitEnum.DIAMOND));
        assertEquals(diamond, GameFactory.make_Suit_Diamond());
        assertEquals(diamond, new Suit(diamond.hashCode()));

        // Test Diamond Clone
        Suit clonedDiamond = diamond.clone();
        assertEquals(diamond, clonedDiamond);
        assertNotSame(diamond, clonedDiamond);

        // Test Diamond toString
        assertEquals(diamond.toString(), "" + diamondSymbol);

        // Test Diamond getSymbol
        assertEquals(diamond.getSymbol(), diamondSymbol);

        System.out.println("Suit Diamond tests passed.");
    }

    @Test
    void HeartTest() {
        Suit heart = new Suit(Suit.SuitEnum.HEART);

        // Test Spade HashCode
        assertEquals(heart.hashCode(), 3);

        // Test Spade Equals
        assertNotEquals(heart, null);
        assertNotEquals(heart, 3);
        assertNotEquals(heart, 'c');
        assertEquals(heart, new Suit(Suit.SuitEnum.HEART));
        assertEquals(heart, GameFactory.make_Suit_Heart());
        assertEquals(heart, new Suit(heart.hashCode()));

        // Test Spade Clone
        Suit clonedHeart = heart.clone();
        assertEquals(heart, clonedHeart);
        assertNotSame(heart, clonedHeart);

        // Test Spade toString
        assertEquals(heart.toString(), "" + heartSymbol);

        // Test Spade getSymbol
        assertEquals(heart.getSymbol(), heartSymbol);

        System.out.println("Suit Heart tests passed.");
    }

    @Test
    void ExceptionsTest() {
        assertThrows(IllegalArgumentException.class, () -> {Suit illegalSuit = new Suit (-1);}, "Suit Index out of bound, must be bewteen 0 to 3.");
        assertThrows(IllegalArgumentException.class, () -> {Suit illegalSuit = new Suit (4);}, "Suit Index out of bound, must be bewteen 0 to 3.");
        System.out.println("Suit Exception tests passed");
    }
}