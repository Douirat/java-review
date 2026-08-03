public class ExerciseRunner {

    public static void main(String[] args) {

        System.out.println("===== DEFAULT VALUES =====");

        Star star = new Star();

        System.out.println("Name: " + star.getName());
        System.out.println("X: " + star.getX());
        System.out.println("Y: " + star.getY());
        System.out.println("Z: " + star.getZ());
        System.out.println("Magnitude: " + star.getMagnitude());

        System.out.println("\n===== SETTERS TEST =====");

        star.setName("Sirius");
        star.setX(8.6);
        star.setY(-3.2);
        star.setZ(15.4);
        star.setMagnitude(-1.46);

        System.out.println("Name: " + star.getName());
        System.out.println("X: " + star.getX());
        System.out.println("Y: " + star.getY());
        System.out.println("Z: " + star.getZ());
        System.out.println("Magnitude: " + star.getMagnitude());

        System.out.println("\n===== DECIMAL VALUES =====");

        star.setX(123.456);
        star.setY(789.123);
        star.setZ(-456.789);
        star.setMagnitude(2.75);

        System.out.println("X: " + star.getX());
        System.out.println("Y: " + star.getY());
        System.out.println("Z: " + star.getZ());
        System.out.println("Magnitude: " + star.getMagnitude());

        System.out.println("\n===== NEGATIVE COORDINATES =====");

        star.setX(-100);
        star.setY(-200);
        star.setZ(-300);

        System.out.println("X: " + star.getX());
        System.out.println("Y: " + star.getY());
        System.out.println("Z: " + star.getZ());

        System.out.println("\n===== LARGE VALUES =====");

        star.setX(Double.MAX_VALUE);
        star.setY(Double.MIN_VALUE);
        star.setZ(1.0e150);
        star.setMagnitude(Double.MAX_VALUE);

        System.out.println("X: " + star.getX());
        System.out.println("Y: " + star.getY());
        System.out.println("Z: " + star.getZ());
        System.out.println("Magnitude: " + star.getMagnitude());

        System.out.println("\n===== EMPTY NAME =====");

        star.setName("");

        System.out.println("Name: '" + star.getName() + "'");

        System.out.println("\n===== CHANGING ONLY MAGNITUDE =====");

        star.setName("Betelgeuse");
        star.setX(50);
        star.setY(60);
        star.setZ(70);

        star.setMagnitude(0.42);

        System.out.println("Name: " + star.getName());
        System.out.println("X: " + star.getX());
        System.out.println("Y: " + star.getY());
        System.out.println("Z: " + star.getZ());
        System.out.println("Magnitude: " + star.getMagnitude());

        System.out.println("\n===== MULTIPLE OBJECTS =====");

        Star star1 = new Star();
        Star star2 = new Star();

        star1.setName("Vega");
        star1.setMagnitude(0.03);

        star2.setName("Rigel");
        star2.setMagnitude(0.18);

        System.out.println("Star1");
        System.out.println("Name: " + star1.getName());
        System.out.println("Magnitude: " + star1.getMagnitude());

        System.out.println();

        System.out.println("Star2");
        System.out.println("Name: " + star2.getName());
        System.out.println("Magnitude: " + star2.getMagnitude());

        System.out.println("\n===== INDEPENDENCE TEST =====");

        star1.setMagnitude(99);

        System.out.println("Star1 Magnitude: " + star1.getMagnitude());
        System.out.println("Star2 Magnitude: " + star2.getMagnitude());
    }
}