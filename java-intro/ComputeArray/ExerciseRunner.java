import java.util.Arrays;

public class ExerciseRunner {

    public static void test(int[] input, int[] expected) {
        int[] actual = ComputeArray.computeArray(input);

        if (Arrays.equals(actual, expected)) {
            System.out.println("[PASS] " + Arrays.toString(input));
            System.out.println("       Result: " + Arrays.toString(actual));
        } else {
            System.out.println("[FAIL] " + Arrays.toString(input));
            System.out.println("       Expected: " + Arrays.toString(expected));
            System.out.println("       Got     : " + Arrays.toString(actual));
        }
    }

    public static void main(String[] args) {

        System.out.println("=== EXAMPLE CASE ===");
        test(
            new int[]{9, 13, 8, 23, 1, 0, 89},
            new int[]{45, 20, 8, 23, 8, 0, 89}
        );

        System.out.println("\n=== EMPTY ARRAY ===");
        test(
            new int[]{},
            new int[]{}
        );

        System.out.println("\n=== SINGLE ELEMENTS ===");
        test(
            new int[]{0},
            new int[]{0}
        );

        test(
            new int[]{1},
            new int[]{8}
        );

        test(
            new int[]{2},
            new int[]{2}
        );

        test(
            new int[]{3},
            new int[]{15}
        );

        System.out.println("\n=== ALL MULTIPLES OF 3 ===");
        test(
            new int[]{3, 6, 9, 12},
            new int[]{15, 30, 45, 60}
        );

        System.out.println("\n=== ALL NUMBERS ≡ 1 (mod 3) ===");
        test(
            new int[]{1, 4, 7, 10},
            new int[]{8, 11, 14, 17}
        );

        System.out.println("\n=== ALL NUMBERS ≡ 2 (mod 3) ===");
        test(
            new int[]{2, 5, 8, 11},
            new int[]{2, 5, 8, 11}
        );

        System.out.println("\n=== MIXED CASE ===");
        test(
            new int[]{1, 2, 3, 4, 5, 6},
            new int[]{8, 2, 15, 11, 5, 30}
        );

        System.out.println("\n=== NEGATIVE NUMBERS ===");
        test(
            new int[]{-3, -2, -1, 0, 1, 2, 3},
            new int[]{-15, -2, 6, 0, 8, 2, 15}
        );

        System.out.println("\n=== LARGE NUMBERS ===");
        test(
            new int[]{999, 1000, 1001},
            new int[]{4995, 1007, 1001}
        );
    }
}