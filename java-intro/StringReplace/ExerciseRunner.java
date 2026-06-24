public class ExerciseRunner {

    private static void test(String label, String s, String t, String r, String expected) {
        try {
            String result = StringReplace.replace(s, t, r);

            boolean ok = (expected == null)
                    ? result == null
                    : expected.equals(result);

            System.out.println(label
                    + " => result: [" + result + "]"
                    + " | expected: [" + expected + "]"
                    + " | " + (ok ? "PASS" : "FAIL"));

        } catch (Exception e) {
            System.out.println(label + " => EXCEPTION: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {

        // Basic cases
        test("Basic replace", "Hello World", "World", "Java", "Hello Java");

        // Multiple occurrences
        test("Multiple occurrences", "aaaa", "a", "b", "bbbb");

        // No match
        test("No match", "Hello", "x", "y", "Hello");

        // Empty target (edge case)
        test("Empty target", "Hello", "", "X", "Hello");

        // Replacement empty (deletion)
        test("Delete substring", "Hello World", " World", "", "Hello");

        // Overlapping safety
        test("Overlap case", "aaaaa", "aa", "b", "bba");

        // Unicode
        test("Unicode", "café café", "café", "tea", "tea tea");

        // Case sensitivity
        test("Case sensitive", "Hello hello", "hello", "X", "Hello X");

        // Full match
        test("Full match", "abc", "abc", "xyz", "xyz");

        // Empty string input
        test("Empty input", "", "a", "b", "");

        // Null cases (depends on spec)
        test("Null input", null, "a", "b", null);
    }
}