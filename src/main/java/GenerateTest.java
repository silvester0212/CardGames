public class GenerateTest {
    public static void main(String[] args) {
        // Rank Tests
        generateRankTest();
    }

    public static void generateRankTest() {
        String tab = "    ";

        String[] name = new String[] {
                "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"
        };

        String[] Name = new String[] {
                "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"
        };

        String[] NAME = new String[] {
                "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"
        };

        int[] num = new int[] {
                2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
        };

        String[] toString = new String[] {
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
        };

        for (int i = 0; i < name.length; i++) {
            System.out.println("@Test");
            System.out.println("public void " + Name[i] + "Test() {");
            System.out.println("Rank " + name[i] + " = new Rank(Rank.RankEnum." + NAME[i] + ");");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank " + NAME[i] + " hashCode");
            System.out.println("assertEquals(" + name[i] + ".hashCode(), " + i + ");");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank " + NAME[i] + " equals");
            System.out.println("assertNotEquals(" + name[i] + ", null);");
            System.out.println("assertNotEquals(" + name[i] + ", " + num[i] + ");");
            System.out.println("assertNotEquals(" + name[i] + ", \"" + name[i] + "\");");
            System.out.println("assertEquals(" + name[i] + ", new Rank(Rank.RankEnum." + NAME[i] + "));");
            System.out.println("assertEquals(" + name[i] + ", new Rank(" + i + "));");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank " + NAME[i] + " clone");
            System.out.println("Rank cloned" + Name[i] + " = " + name[i] + ".clone();");
            System.out.println("assertEquals(" + name[i] + ", cloned" + Name[i] + ");");
            System.out.println("assertNotSame(" + name[i] + ", cloned" + Name[i] + ");");
            System.out.println();
            System.out.println(tab + tab + "// Test Rank toString");
            System.out.println("assertEquals(" + name[i] + ".toString(), \"" + toString[i] + "\");");
            System.out.println();
            System.out.println("System.out.println(\"Rank " + Name[i] + " tests passed.\");");
            System.out.println("}");
            System.out.println();
        }
    }
}
