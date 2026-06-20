public class ExerciseRunner {

    public static void test(String[] input, String expected) {
        String actual = DoOp.operate(input);

        if ((expected == null && actual == null) || (expected != null && expected.equals(actual))) {
            System.out.println("[PASS] " + format(input) + " = " + actual);
        } else {
            System.out.println("[FAIL] " + format(input));
            System.out.println("       Expected: " + expected);
            System.out.println("       Got     : " + actual);
        }
    }

    private static String format(String[] args) {
        return "[" + args[0] + ", " + args[1] + ", " + args[2] + "]";
    }

    public static void main(String[] args) {

        System.out.println("=== BASIC OPERATIONS ===");
        test(new String[]{"1", "+", "2"}, "3");
        test(new String[]{"1", "-", "1"}, "0");
        test(new String[]{"2", "*", "3"}, "6");

        System.out.println("\n=== DIVISION ===");
        test(new String[]{"10", "/", "2"}, "5");
        test(new String[]{"9", "/", "3"}, "3");

        System.out.println("\n=== MODULO ===");
        test(new String[]{"10", "%", "3"}, "1");
        test(new String[]{"14", "%", "5"}, "4");

        System.out.println("\n=== DIVISION / MOD BY ZERO ===");
        test(new String[]{"10", "/", "0"}, "Error");
        test(new String[]{"10", "%", "0"}, "Error");

        System.out.println("\n=== UNKNOWN OPERATOR ===");
        test(new String[]{"1", "^", "2"}, "Error");
        test(new String[]{"1", "x", "2"}, "Error");

        System.out.println("\n=== NEGATIVE NUMBERS ===");
        test(new String[]{"-5", "+", "2"}, "-3");
        test(new String[]{"-5", "*", "2"}, "-10");
        test(new String[]{"-5", "%", "2"}, "-1");

        System.out.println("\n=== EDGE CASES ===");
        test(new String[]{"0", "+", "0"}, "0");
        test(new String[]{"0", "*", "100"}, "0");
        test(new String[]{"100", "/", "1"}, "100");
    }
}