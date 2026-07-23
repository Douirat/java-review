public class DoOp {
    public static String operate(String[] args) {
        if (args.length < 3) {
            return null;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[2]);

            var result = new StringBuilder();

            switch (args[1]) {
                case "+":
                    result.append((x + y));
                    break;
                case "-":
                    result.append((x - y));
                    break;
                case "*":
                    result.append((x * y));
                    break;
                case "/":
                    result.append((x / y));
                    break;
                case "%":
                    result.append((x % y));
                    break;
                default:
                    result.append("Error");
            }

            return result.toString();

        } catch (Exception e) {
            return "Error";
        }

    }
}