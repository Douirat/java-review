import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExerciseRunner {

    public static void test(String[] input, String expected) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        PrintStream originalOut = System.out;

        System.setOut(printStream);
        SortArgs.sort(input);
        System.setOut(originalOut);

        String actual = outputStream.toString();

        if (actual.equals(expected)) {
            System.out.println("[PASS] " + format(input));
        } else {
            System.out.println("[FAIL] " + format(input));
            System.out.println("       Expected: " + escape(expected));
            System.out.println("       Got     : " + escape(actual));
        }
    }

    private static String format(String[] args) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            if (i < args.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private static String escape(String s) {
        return s.replace("\n", "\\n");
    }

    public static void main(String[] args) {

        System.out.println("=== BASIC CASE ===");
        test(new String[]{"4", "2", "1", "3"}, "1 2 3 4\n");

        System.out.println("\n=== ALREADY SORTED ===");
        test(new String[]{"1", "2", "3", "4"}, "1 2 3 4\n");

        System.out.println("\n=== REVERSE ORDER ===");
        test(new String[]{"9", "7", "5", "3", "1"}, "1 3 5 7 9\n");

        System.out.println("\n=== SINGLE ELEMENT ===");
        test(new String[]{"42"}, "42\n");

        System.out.println("\n=== NEGATIVE NUMBERS ===");
        test(new String[]{"-1", "-3", "2", "0"}, "-3 -1 0 2\n");

        System.out.println("\n=== DUPLICATES ===");
        test(new String[]{"2", "2", "1", "1"}, "1 1 2 2\n");

        System.out.println("\n=== MIXED NUMBERS ===");
        test(new String[]{"10", "-10", "5", "0"}, "-10 0 5 10\n");

        System.out.println("\n=== LARGE NUMBERS ===");
        test(new String[]{"1000", "999", "1001"}, "999 1000 1001\n");
    }
}