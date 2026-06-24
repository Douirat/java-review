public class ExerciseRunner {

    private static void test(String label, String input, int expected) {
        try {
            int result = StringLength.getStringLength(input);
            System.out.println(label + " => result: " + result + " | expected: " + expected
                    + " | " + (result == expected ? "PASS" : "FAIL"));
        } catch (Exception e) {
            System.out.println(label + " => EXCEPTION: " + e.getClass().getSimpleName()
                    + " | " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Basic cases
        test("Empty string", "", 0);
        test("Single char", "a", 1);
        test("Normal string", "Hello World !", 13);

        // Spaces and formatting
        test("Spaces only", "     ", 5);
        test("Leading/trailing spaces", "  hello  ", 9);

        // Special characters
        test("Newline", "a\nb", 3);
        test("Tab", "a\tb", 3);
        test("Symbols", "!@#$%^&*", 8);

        // Unicode / multilingual
        test("Unicode basic", "café", 4);
        test("Emoji", "🙂🙂", 2);
        test("Chinese characters", "你好世界", 4);

        // Mixed content
        test("Mixed", "Hello🙂世界\n", 9);

        // Long string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("x");
        }
        test("Long string (1000 chars)", sb.toString(), 1000);

        // Edge case: null
        test("Null input", null, -1); // expected behavior depends on your implementation
    }
}