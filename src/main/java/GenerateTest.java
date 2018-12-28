import Generic.Rank;
import Generic.Suit;

public class GenerateTest {
    private static String tab = "    ";

    private static int SuitCount = Suit.SuitEnum.values().length;

    private static String[] Suit_Name = new String[] {
            "Spade", "Club", "Diamond", "Heart"
    };

    private static String[] Suit_NAME = new String[] {
            "SPADE", "CLUB", "DIAMOND", "HEART"
    };

    private static String[] Suit_toString = new String[] {
            "\\u2660",
            "\\u2663",
            "\\u2666",
            "\\u2764"
    };

    private static int RankCount = Rank.RankEnum.values().length;

    private static String[] Rank_name = new String[] {
            "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"
    };

    private static String[] Rank_Name = new String[] {
            "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"
    };

    private static String[] Rank_NAME = new String[] {
            "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"
    };

    private static String[] Rank_toString = new String[] {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
    };

    public static void validCheck() {
        // Suit arrays length check
        assert(SuitCount == Suit_NAME.length);
        assert(SuitCount == Suit_Name.length);
        assert(SuitCount == Suit_toString.length);

        // Rank arrays length check
        assert(RankCount == Rank_NAME.length);
        assert(RankCount == Rank_Name.length);
        assert(RankCount == Rank_name.length);
        assert(RankCount == Rank_toString.length);
    }

    public static void main(String[] args) {
        // Valid check for this class
        validCheck();

        // Factory Rank Codes
//        generateRankFactoryCode();

        // Rank Tests
//        generateRankTest();

        // Factory Card Codes
//        generateCardFactoryCode();

        // Card Tests
        generateCardTest();

    }

    public static void generateCardTest() {
        for (int i = 0; i < SuitCount; i++) {
            for (int j = 0; j < RankCount; j++) {
                System.out.println(
                        "    @Test\n" +
                        "    void " + Rank_Name[j] + Suit_Name[i] + "Test() {\n" +
                        "        Card card" + Rank_Name[j] + Suit_Name[i] + " = new Card(new Suit(Suit.SuitEnum." + Suit_NAME[i] + "), new Rank(Rank.RankEnum." + Rank_NAME[j] + "));\n" +
                        "\n" +
                        "        // Hash Code\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ".hashCode(), " + (100 * i + j) + ");\n" +
                        "\n" +
                        "        // Equals\n" +
                        "        assertNotEquals(card" + Rank_Name[j] + Suit_Name[i] + ", null);\n" +
                        "        assertNotEquals(card" + Rank_Name[j] + Suit_Name[i] + ", " + (100 * i + j) + ");\n" +
                        "        assertNotEquals(card" + Rank_Name[j] + Suit_Name[i] + ", \"" + Rank_toString[j] + " OF " + Suit_NAME[i] + "\");\n" +
                        "        assertNotEquals(card" + Rank_Name[j] + Suit_Name[i] + ", new int[] {" + i + ", " + j + "});\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ", new Card(new Suit(Suit.SuitEnum." + Suit_NAME[i] + "), new Rank(Rank.RankEnum." + Rank_NAME[j] + ")));\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ", new Card(" + i + ", " + j + "));\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ", GameFactory.make_Card_" + Rank_Name[j] + "_" + Suit_Name[i] + "());\n" +
                        "\n" +
                        "        // Clone\n" +
                        "        Card cloned" + Rank_Name[j] + Suit_Name[i] + " = card" + Rank_Name[j] + Suit_Name[i] + ".clone();\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ", cloned" + Rank_Name[j] + Suit_Name[i] + ");\n" +
                        "        assertNotSame(card" + Rank_Name[j] + Suit_Name[i] + ", cloned" + Rank_Name[j] + Suit_Name[i] + ");\n" +
                        "\n" +
                        "        // toString\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ".toString(), '" + Suit_toString[i] + "' + \"" + Rank_toString[j] + "\");\n" +
                        "\n" +
                        "        // getRank\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ".getRank(), GameFactory.make_Rank_" + Rank_Name[j] + "());\n" +
                        "\n" +
                        "        // getSuit\n" +
                        "        assertEquals(card" + Rank_Name[j] + Suit_Name[i] + ".getSuit(), GameFactory.make_Suit_" + Suit_Name[i] + "());\n" +
                        "\n" +
                        "        System.out.println(\"Card " + Rank_Name[j] + " of " + Suit_Name[i] + " tests passed.\");\n" +
                        "    }\n"
                );
            }
        }
    }

    public static void generateCardFactoryCode() {
        for (int i = 0; i < SuitCount; i++) {
            for (int j = 0; j < RankCount; j++) {
                System.out.println(
                        "    public static Card make_Card_" + Rank_Name[j] + "_" + Suit_Name[i] + "() {\n" +
                                "        return new Card(new Suit(Suit.SuitEnum." + Suit_NAME[i] + "), new Rank(Rank.RankEnum." + Rank_NAME[j] + "));\n" +
                                "    }\n"
                );
            }
        }
    }

    public static void generateRankFactoryCode() {
        for (int j = 0; j < RankCount; j++) {
            System.out.println("public static Rank make_Rank_" + Rank_Name[j] + "() {");
            System.out.println("    return new Rank(Rank.RankEnum." + Rank_NAME[j] + ");");
            System.out.println("}");
            System.out.println();
        }
    }

    public static void generateRankTest() {
        int[] num = new int[] {
                2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
        };

        for (int j = 0; j < RankCount; j++) {
            System.out.println("@Test");
            System.out.println("public void " + Rank_Name[j] + "Test() {");
            System.out.println("Rank " + Rank_name[j] + " = new Rank(Rank.RankEnum." + Rank_NAME[j] + ");");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank " + Rank_NAME[j] + " hashCode");
            System.out.println("assertEquals(" + Rank_name[j] + ".hashCode(), " + j + ");");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank " + Rank_NAME[j] + " equals");
            System.out.println("assertNotEquals(" + Rank_name[j] + ", null);");
            System.out.println("assertNotEquals(" + Rank_name[j] + ", " + num[j] + ");");
            System.out.println("assertNotEquals(" + Rank_name[j] + ", \"" + Rank_name[j] + "\");");
            System.out.println("assertEquals(" + Rank_name[j] + ", new Rank(Rank.RankEnum." + Rank_NAME[j] + "));");
            System.out.println("assertEquals(" + Rank_name[j] + ", new Rank(" + j + "));");
            System.out.println("assertEquals(" + Rank_name[j] + ", GameFactory.make_Rank_" + Rank_Name[j] + "());");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank " + Rank_NAME[j] + " clone");
            System.out.println("Rank cloned" + Rank_Name[j] + " = " + Rank_name[j] + ".clone();");
            System.out.println("assertEquals(" + Rank_name[j] + ", cloned" + Rank_Name[j] + ");");
            System.out.println("assertNotSame(" + Rank_name[j] + ", cloned" + Rank_Name[j] + ");");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank Rank_toString");
            System.out.println("assertEquals(" + Rank_name[j] + ".Rank_toString(), \"" + Rank_toString[j] + "\");");
            System.out.println();
            System.out.println("System.out.println(\"Rank " + Rank_Name[j] + " tests passed.\");");
            System.out.println("}");
            System.out.println();
        }
    }
}
