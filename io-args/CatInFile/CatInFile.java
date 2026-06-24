import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0)
            return;
        if (args[0].length() == 0)
            return;
        try {
            File file = new File(args[0]);
            OutputStream out = new FileOutputStream(file);
         
            InputStream in = System.in;

              byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }

           

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}