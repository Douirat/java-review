
public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3)
            return null;
        String result = new String();
        try {

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[2]);

            switch (args[1]) {
                case "+":
                     return result +=  (x + y);
                case "-":
                    return result +=( x - y);
                case "*":
                    return result += (x * y);
                case "/":
                    return result += (x / y);
                case "%":
                    return result += (x % y);
                default:
                    throw new RuntimeException("invalid operator");
            }
           

        } catch (Exception e) {
            return "Error";
        }
      
    }
}