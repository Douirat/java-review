public class ExerciseRunner {

    private static void test(String label, String sub, String s, Boolean expected) {
        try {
            boolean result = StringContains.isStringContainedIn(sub, s);

            boolean ok = (expected == null) ? true : (result == expected);

            System.out.println(label
                    + " => result: " + result
                    + " | expected: " + expected
                    + " | " + (ok ? "PASS" : "FAIL"));

        } catch (Exception e) {
            System.out.println(label + " => EXCEPTION: "
                    + e.getClass().getSimpleName()
                    + " | " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Basic cases
        test("Simple match", "Hell", "Highway to Hell", true);
        test("Prefix match", "Hello", "Hello World !", true);
        test("No match", "Bonjour", "hello World !", false);

        // Case sensitivity (Java String is case-sensitive)
        test("Case mismatch", "hell", "Hello", false);

        // Full string match
        test("Exact match", "Hello", "Hello", true);

        // Empty string cases
        test("Empty subString", "", "Hello", true); // empty always contained
        test("Empty text", "Hello", "", false);
        test("Both empty", "", "", true);

        // Spaces
        test("Space contained", "lo W", "Hello World", true);
        test("Leading space", "Hello", " Hello", true);

        // Special characters
        test("Symbols", "@#$", "abc@#$xyz", true);
        test("Newline", "a\nb", "xx a\nb xx", true);
        test("Tab", "a\tb", "a\tb", true);

        // Unicode
        test("Accents", "étu", "étudiant", true);
        test("Emoji", "🙂", "Hello 🙂 World", true);
        test("Chinese", "世界", "你好世界", true);

        // Overlapping patterns
        test("Overlapping", "aaa", "aaaaaa", true);
        test("Partial overlap", "aba", "ababa", true);

        // Not contained edge
        test("Close but not match", "Helloo", "Hello", false);

        // Large input
        StringBuilder big = new StringBuilder();
        for (int i = 0; i < 10000; i++) big.append("a");
        test("Large string contained", "aaaaa", big.toString(), true);
        test("Large string not contained", "aaaaab", big.toString(), false);

        // Null handling (depends on implementation)
        test("Null subString", null, "Hello", false);
        test("Null text", "Hello", null, false);
        test("Both null", null, null, false);
    }
}