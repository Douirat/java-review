import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if(args.length == 0) return;
        if(args[0].length() == 0){ System.out.println(""); return;}
        try {
            byte[] bytes = Files.readAllBytes(Path.of(args[0]));
            System.out.write(bytes);
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}