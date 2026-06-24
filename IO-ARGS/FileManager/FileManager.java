import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        try {
            FileOutputStream out = new FileOutputStream(fileName);
            out.write(content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        try {
            byte[] data = Files.readAllBytes(Path.of(fileName));
            String str = new String(data, StandardCharsets.UTF_8);
            return str;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        try {
         Files.deleteIfExists(Path.of(fileName)); 
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}