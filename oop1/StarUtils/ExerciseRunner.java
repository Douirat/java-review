public class ExerciseRunner {

    public static void main(String[] args) {

        // ============================================================
        // 1. DEFAULT CONSTRUCTOR
        // ============================================================

        System.out.println("========== DEFAULT CONSTRUCTOR ==========");

        CelestialObject celestialObject = new CelestialObject();

        System.out.println("Object: " + celestialObject);
        System.out.println("HashCode: " + celestialObject.hashCode());


        // ============================================================
        // 2. PARAMETERIZED CONSTRUCTOR
        // ============================================================

        System.out.println("\n========== PARAMETERIZED CONSTRUCTOR ==========");

        CelestialObject earth =
                new CelestialObject("Terre", 1.0, 2.0, 2.0);

        System.out.println(earth);
        System.out.println("HashCode: " + earth.hashCode());


        // ============================================================
        // 3. TOSTRING() - NORMAL VALUES
        // ============================================================

        System.out.println("\n========== TOSTRING - NORMAL VALUES ==========");

        CelestialObject mars =
                new CelestialObject("Mars", 10.123456, 20.987654, 30.555555);

        System.out.println(mars);

        // Expected:
        // Mars is positioned at (10.123, 20.988, 30.556)


        // ============================================================
        // 4. TOSTRING() - ZERO VALUES
        // ============================================================

        System.out.println("\n========== TOSTRING - ZERO VALUES ==========");

        CelestialObject origin =
                new CelestialObject("Origin", 0.0, 0.0, 0.0);

        System.out.println(origin);

        // Expected:
        // Origin is positioned at (0.000, 0.000, 0.000)


        // ============================================================
        // 5. TOSTRING() - NEGATIVE VALUES
        // ============================================================

        System.out.println("\n========== TOSTRING - NEGATIVE VALUES ==========");

        CelestialObject negative =
                new CelestialObject("Negative", -1.23456, -2.34567, -3.45678);

        System.out.println(negative);

        // Expected:
        // Negative is positioned at (-1.235, -2.346, -3.457)


        // ============================================================
        // 6. TOSTRING() - VERY SMALL VALUES
        // ============================================================

        System.out.println("\n========== TOSTRING - VERY SMALL VALUES ==========");

        CelestialObject small =
                new CelestialObject(
                        "Small",
                        0.0001,
                        -0.0001,
                        0.000001
                );

        System.out.println(small);

        // This tests rounding to 3 decimal places.


        // ============================================================
        // 7. TOSTRING() - VERY LARGE VALUES
        // ============================================================

        System.out.println("\n========== TOSTRING - VERY LARGE VALUES ==========");

        CelestialObject large =
                new CelestialObject(
                        "Large",
                        1_000_000.123456,
                        2_000_000.654321,
                        3_000_000.999999
                );

        System.out.println(large);


        // ============================================================
        // 8. EQUAL OBJECTS
        // ============================================================

        System.out.println("\n========== EQUAL OBJECTS ==========");

        CelestialObject earth1 =
                new CelestialObject("Terre", 1.0, 2.0, 2.0);

        CelestialObject earth2 =
                new CelestialObject("Terre", 1.0, 2.0, 2.0);

        System.out.println("earth1.equals(earth2): "
                + earth1.equals(earth2));

        // Expected: true


        // ============================================================
        // 9. SAME REFERENCE
        // ============================================================

        System.out.println("\n========== SAME REFERENCE ==========");

        System.out.println("earth1.equals(earth1): "
                + earth1.equals(earth1));

        // Expected: true


        // ============================================================
        // 10. DIFFERENT NAME
        // ============================================================

        System.out.println("\n========== DIFFERENT NAME ==========");

        CelestialObject differentName =
                new CelestialObject("Mars", 1.0, 2.0, 2.0);

        System.out.println("earth1.equals(differentName): "
                + earth1.equals(differentName));

        // Expected: false


        // ============================================================
        // 11. DIFFERENT X
        // ============================================================

        System.out.println("\n========== DIFFERENT X ==========");

        CelestialObject differentX =
                new CelestialObject("Terre", 999.0, 2.0, 2.0);

        System.out.println("earth1.equals(differentX): "
                + earth1.equals(differentX));

        // Expected: false


        // ============================================================
        // 12. DIFFERENT Y
        // ============================================================

        System.out.println("\n========== DIFFERENT Y ==========");

        CelestialObject differentY =
                new CelestialObject("Terre", 1.0, 999.0, 2.0);

        System.out.println("earth1.equals(differentY): "
                + earth1.equals(differentY));

        // Expected: false


        // ============================================================
        // 13. DIFFERENT Z
        // ============================================================

        System.out.println("\n========== DIFFERENT Z ==========");

        CelestialObject differentZ =
                new CelestialObject("Terre", 1.0, 2.0, 999.0);

        System.out.println("earth1.equals(differentZ): "
                + earth1.equals(differentZ));

        // Expected: false


        // ============================================================
        // 14. NULL
        // ============================================================

        System.out.println("\n========== NULL ==========");

        System.out.println("earth1.equals(null): "
                + earth1.equals(null));

        // Expected: false


        // ============================================================
        // 15. DIFFERENT CLASS
        // ============================================================

        System.out.println("\n========== DIFFERENT CLASS ==========");

        String text = "Terre";

        System.out.println("earth1.equals(text): "
                + earth1.equals(text));

        // Expected: false


        // ============================================================
        // 16. HASHCODE OF EQUAL OBJECTS
        // ============================================================

        System.out.println("\n========== HASHCODE - EQUAL OBJECTS ==========");

        CelestialObject object1 =
                new CelestialObject("Earth", 1.0, 2.0, 3.0);

        CelestialObject object2 =
                new CelestialObject("Earth", 1.0, 2.0, 3.0);

        System.out.println("object1.equals(object2): "
                + object1.equals(object2));

        System.out.println("object1.hashCode(): "
                + object1.hashCode());

        System.out.println("object2.hashCode(): "
                + object2.hashCode());

        System.out.println("HashCodes are equal: "
                + (object1.hashCode() == object2.hashCode()));

        // Expected:
        // equals -> true
        // hashCodes -> true


        // ============================================================
        // 17. HASHCODE OF DIFFERENT OBJECTS
        // ============================================================

        System.out.println("\n========== HASHCODE - DIFFERENT OBJECTS ==========");

        CelestialObject object3 =
                new CelestialObject("Mars", 1.0, 2.0, 3.0);

        System.out.println("object1.equals(object3): "
                + object1.equals(object3));

        System.out.println("object1.hashCode(): "
                + object1.hashCode());

        System.out.println("object3.hashCode(): "
                + object3.hashCode());

        // Expected:
        // equals -> false
        //
        // Usually hashCodes will be different,
        // but Java DOES NOT require unequal objects
        // to have different hashCodes.


        // ============================================================
        // 18. THREE EQUAL OBJECTS
        // ============================================================

        System.out.println("\n========== THREE EQUAL OBJECTS ==========");

        CelestialObject a =
                new CelestialObject("Planet", 10.0, 20.0, 30.0);

        CelestialObject b =
                new CelestialObject("Planet", 10.0, 20.0, 30.0);

        CelestialObject c =
                new CelestialObject("Planet", 10.0, 20.0, 30.0);

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("b.equals(c): " + b.equals(c));
        System.out.println("a.equals(c): " + a.equals(c));

        System.out.println("a.hashCode() == b.hashCode(): "
                + (a.hashCode() == b.hashCode()));

        System.out.println("b.hashCode() == c.hashCode(): "
                + (b.hashCode() == c.hashCode()));

        System.out.println("a.hashCode() == c.hashCode(): "
                + (a.hashCode() == c.hashCode()));


        // ============================================================
        // 19. SYMMETRY
        // ============================================================

        System.out.println("\n========== EQUALS SYMMETRY ==========");

        CelestialObject first =
                new CelestialObject("Earth", 1.0, 2.0, 3.0);

        CelestialObject second =
                new CelestialObject("Earth", 1.0, 2.0, 3.0);

        System.out.println("first.equals(second): "
                + first.equals(second));

        System.out.println("second.equals(first): "
                + second.equals(first));

        // Both should be true.


        // ============================================================
        // 20. PRECISION / DOUBLE VALUES
        // ============================================================

        System.out.println("\n========== DOUBLE PRECISION ==========");

        CelestialObject precision1 =
                new CelestialObject(
                        "Precision",
                        1.0000001,
                        2.0000001,
                        3.0000001
                );

        CelestialObject precision2 =
                new CelestialObject(
                        "Precision",
                        1.0000002,
                        2.0000002,
                        3.0000002
                );

        System.out.println("precision1: " + precision1);
        System.out.println("precision2: " + precision2);

        System.out.println("precision1.equals(precision2): "
                + precision1.equals(precision2));

        // Important:
        // Even though toString() may display the same rounded values,
        // equals() should compare the actual double properties.
        //
        // Therefore, these objects should normally NOT be equal.


        // ============================================================
        // 21. NEGATIVE ZERO
        // ============================================================

        System.out.println("\n========== NEGATIVE ZERO ==========");

        CelestialObject zero1 =
                new CelestialObject("Zero", 0.0, 0.0, 0.0);

        CelestialObject zero2 =
                new CelestialObject("Zero", -0.0, -0.0, -0.0);

        System.out.println("zero1: " + zero1);
        System.out.println("zero2: " + zero2);

        System.out.println("zero1.equals(zero2): "
                + zero1.equals(zero2));


        // ============================================================
        // 22. SPECIAL DOUBLE VALUES
        // ============================================================

        System.out.println("\n========== SPECIAL DOUBLE VALUES ==========");

        CelestialObject special1 =
                new CelestialObject(
                        "Special",
                        Double.NaN,
                        Double.POSITIVE_INFINITY,
                        Double.NEGATIVE_INFINITY
                );

        CelestialObject special2 =
                new CelestialObject(
                        "Special",
                        Double.NaN,
                        Double.POSITIVE_INFINITY,
                        Double.NEGATIVE_INFINITY
                );

        System.out.println("special1: " + special1);
        System.out.println("special2: " + special2);

        System.out.println("special1.equals(special2): "
                + special1.equals(special2));

        System.out.println("HashCodes equal: "
                + (special1.hashCode() == special2.hashCode()));


        // ============================================================
        // 23. FINAL SUMMARY
        // ============================================================

        System.out.println("\n========== FINAL SUMMARY ==========");

        System.out.println("All tests completed.");
    }
}