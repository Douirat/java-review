public class ExerciseRunner {

    public static void test(String input, boolean expected) {
        boolean actual = Palindrome.isPalindrome(input);

        if (actual == expected) {
            System.out.println("[PASS] \"" + input + "\" -> " + actual);
        } else {
            System.out.println("[FAIL] \"" + input + "\"");
            System.out.println("       Expected: " + expected);
            System.out.println("       Got     : " + actual);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== BASIC CASES ===");
        test("ressasser", true);
        test("Bonjour", false);

        System.out.println("\n=== SINGLE CHARACTER ===");
        test("a", true);
        test("Z", true);

        System.out.println("\n=== EMPTY STRING ===");
        test("", true);

        System.out.println("\n=== EVEN LENGTH ===");
        test("abba", true);
        test("abca", false);

        System.out.println("\n=== ODD LENGTH ===");
        test("kayak", true);
        test("radar", true);
        test("hello", false);

        System.out.println("\n=== REPEATED CHARACTERS ===");
        test("aaaa", true);
        test("aaab", false);

        System.out.println("\n=== NUMBERS AS CHARACTERS ===");
        test("1221", true);
        test("12321", true);
        test("12345", false);

        System.out.println("\n=== MIXED CASE ===");
        test("Kayak", false);
        test("RaceCar", false);

        System.out.println("\n=== SPACES ===");
        test("nurses run", false);
        test(" a ", true);

        System.out.println("\n=== SPECIAL CHARACTERS ===");
        test("!@#@!", true);
        test("abc$cba", true);
        test("abc#def", false);

        System.out.println("\n=== LONGER STRINGS ===");
        test("amanaplanacanalpanama", true);
        test("abcdefghijklmnopqrstuvwxyz", false);
    }
}