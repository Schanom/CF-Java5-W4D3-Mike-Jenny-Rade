package Jenny;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A3 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("readme.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
