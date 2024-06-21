import java.io.FileWriter;
import java.io.IOException;

public class fW {
    public static void main(String[] args) throws IOException {
        String content = "This is the string that will be written to a file.";

        // Specify the file path
        String filePath = "output.txt";

        // Create a FileWriter with the file path
        FileWriter f = new FileWriter(filePath);

        // Write the string to the file
        f.write(content);

        // Close the FileWriter to ensure the content is written to the file
        f.close();

        System.out.println("String has been written to the file successfully.");
    }
}
