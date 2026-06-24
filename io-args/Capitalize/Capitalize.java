import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 2)
            return;
        try {
            byte[] bytes = Files.readAllBytes(Path.of(args[0]));

            File file = new File(args[1]);
            FileOutputStream out = new FileOutputStream(file);

            out.write(bytes);
           
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}