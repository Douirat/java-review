public class ExerciseRunner {

    private static void test(String label, String s1, String s2, String expected) {
        try {
            String result = StringConcat.concat(s1, s2);

            boolean ok = (expected == null)
                    ? (result == null)
                    : expected.equals(result);

            System.out.println(label
                    + " => result: [" + result + "]"
                    + " | expected: [" + expected + "]"
                    + " | " + (ok ? "PASS" : "FAIL"));

        } catch (Exception e) {
            System.out.println(label + " => EXCEPTION: "
                    + e.getClass().getSimpleName()
                    + " | " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Basic cases
        test("Basic concat", "Hello ", "étudiant !", "Hello étudiant !");
        test("Empty second", "Hello World !", "", "Hello World !");
        test("Empty first", "", "Hello World !", "Hello World !");
        test("Both empty", "", "", "");

        // Spaces handling
        test("Spaces", "Hello", " World", "Hello World");
        test("Only spaces", "   ", "   ", "      ");

        // Special characters
        test("Symbols", "Hello@", "#World", "Hello@#World");
        test("Newline", "A\n", "B", "A\nB");
        test("Tab", "A\t", "\tB", "A\t\tB");

        // Unicode / accented
        test("Accents", "café", " étudiant", "café étudiant");
        test("Emoji", "🙂", "🚀", "🙂🚀");
        test("Chinese", "你好", "世界", "你好世界");

        // Mixed content
        test("Mixed", "Hello ", "🙂 World", "Hello 🙂 World");

        // Large input
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < 500; i++) a.append("a");
        for (int i = 0; i < 500; i++) b.append("b");

        test("Large strings", a.toString(), b.toString(),
                a.toString() + b.toString());

        // Null cases (behavior depends on implementation)
        test("Null + string", null, "Hello", null);
        test("String + null", "Hello", null, null);
        test("Null + null", null, null, null);
    }
}