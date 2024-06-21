import java.io.FileInputStream;
import java.io.IOException;

public class fR {
    public static void main(String[] args) throws IOException {
        String filePath = "sample.txt"; // Replace with the path to your file
        FileInputStream fileInputStream = new FileInputStream(filePath);
        int data;

        while ((data = fileInputStream.read()) != -1) {
            char character = (char) data;
            System.out.print(character);
        }

        fileInputStream.close();
    }
}
