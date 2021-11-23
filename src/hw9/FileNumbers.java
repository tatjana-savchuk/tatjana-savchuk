package hw9;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileNumbers {
        public static void main() {
            // The target file
            File out = new File("random.txt");
            FileWriter fw = null;
            int n = 99;
            try {
                // Create file writer object
                fw = new FileWriter(out);
                // Wrap the writer with buffered streams
                BufferedWriter writer = new BufferedWriter(fw);
                int line;
                Random random = new Random();
                while (n > 0) {
                    line = random.nextInt(100);
                    writer.write(line + "\n");
                    n--;
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }

